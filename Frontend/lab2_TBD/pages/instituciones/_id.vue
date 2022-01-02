<template>
    <div class="card">
        <h1>Detalles de la institución {{error}}</h1>
        <div class="info-institucion">
            <p> ID Institución: {{institucion.id_institucion}}</p>
            <p> Nombre: {{institucion.nombre}}</p>
            <p> Descripción: {{institucion.descripcion}}</p>
        </div>
    </div>
</template>

<script>
export default {

    data(){
        return {
            institucion: [],
            error: ""
        }
    },

    created() {
		this.getInstitucion();
	},

    methods: {
		getInstitucion: async function () {
			try {
				let response = await this.$axios.get("/instituciones/" + this.$route.params.id);
				this.institucion = response.data;
                if (response.data == ''){
                    this.error = ": Error:No existe la institución."
                }
			} catch (error) {
				console.log("error", error);
			}
		},
	},
}

    
</script>

