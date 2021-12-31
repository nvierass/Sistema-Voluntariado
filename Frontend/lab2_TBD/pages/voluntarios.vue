<template>


    <label>
    
        {{this.titulo}}
        <ul class="item-list">
            <li v-for="(item, index) in items" :key="index">
                {{item.nombre}} - {{item.descripcion}}
            </li>
        </ul>
        <form>
            <div class="form-item">
                <label for="name">Nombre</label>
                    <input type="text" id="name" v-model="institucion.nombre">
                <label for="desc">Descripción </label>
                    <input type="text" id="descripcion" v-model="institucion.descripcion">
            </div>
            <div>
                <button type="button" @click="send">
                        Agregar
                </button>
            </div>
            <label>{{this.error}}</label>
        </form>
    </label>
</template>

<script>
export default {
    data(){
       return{
            titulo: "Pagina de instituciones",
            institucion:{},
            items:[],
            error: ""
        }
    },
    methods:{
        send:async function(){
           try {
               var result = await this.$axios.post('/instituciones/', this.institucion);
               let newInstitucion = result.data;
           } catch (error) {
               this.error = error;
               console.log('error', error)
           }
       },
        getData: async function(){
            try {
                let response = await this.$axios.get('/instituciones/');
                this.items  = response.data;
                console.log(response)
            } catch (error) {
                this.error = "No se ha obtenido información";
                console.log('error', error);
            }
        }
        
    },
    created:function(){
        this.getData();
    }
}

</script>



