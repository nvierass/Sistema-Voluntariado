<template>
    <div class="card">
        <h1>Detalles de la tarea {{error}}</h1>
        <div class="info-tarea">
            <p> ID Tarea: {{tarea.id_tarea}} ID Emergencia: {{tarea.emergencia}}</p>
            <p> Nombre: {{tarea.nombre}}</p>
            <p> Descripción: {{tarea.descripcion}}</p>
            <p> Estado de la tarea: {{tarea.estado_tarea}}</p>
            <div class="nuxt-link">
                <nuxt-link :to="'/tareas/'+tarea.id_tarea+'/voluntarios/'">
                    Ver voluntarios inscritos
                </nuxt-link>
            </div>
            <button class="test" v-on:click="handleRanking">Generar Ranking</button>
        </div>
    </div>
</template>

<script>
export default {

    data(){
        return {
            tarea: [],
            error: ""
        }
    },


    created() {
		this.getTarea();
	},

    methods: {
		getTarea: async function () {
			try {
				let response = await this.$axios.get("/tareas/" + this.$route.params.id);
				this.tarea = response.data;
                if (response.data == ''){
                    this.error = ": Error:No existe la tarea."
                }
			} catch (error) {
				console.log("error", error);
			}
		},
        
        handleRanking: async function(){
            try {
				let response = await this.$axios.get("/tareas/" + this.$route.params.id + "/ranking/");
                console.log("Generando ranking para /tareas/" + this.$route.params.id + "/ranking/");
				alert(response.data);
			} catch (error) {
				console.log("error", error);
			}
        }
	},
}

    
</script>

<style>

    .nuxt-link{
        border: 1px solid whitesmoke;
        padding: .5rem .5rem;
        margin-right: 88%;
    }
    .test {
        background-color: white;
        color: rgb(17, 15, 17);
        border: 2px solid rgb(48, 8, 46) ; /* Green */
    }
</style>