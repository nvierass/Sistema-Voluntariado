<template>
    <div class="card">
        <h1>Detalles de la emergencia {{error}}</h1>
        <div class="info-emergencia">
            <p> ID Emergencia: {{emergencia.id_emergencia}}</p>
            <p> Institución encargada: {{emergencia.institucion_encargada}}</p>
            <h2>Ubicación</h2>
            <p> Región: {{emergencia.region}} </p>
            <p> Ciudad: {{emergencia.ciudad}}</p>
            <p> Estado de la emergencia: {{emergencia.estado_emergencia}}</p>
            <h2>Detalles del encargado</h2>
            <p> Nombre: {{emergencia.nombre_coordinador}}</p>
            <p> RUN: {{emergencia.rut_coordinador}}</p>
            <p> Correo: {{emergencia.correo_coordinador}}</p>
        </div>
    </div>
</template>

<script>
export default {

    data(){
        return {
            emergencia: [],
            error: ""
        }
    },

    created() {
		this.getEmergencia();
	},

    methods: {
		getEmergencia: async function () {
			try {
				let response = await this.$axios.get("/emergencias/" + this.$route.params.id);
				this.emergencia = response.data;
                if (response.data == ''){
                    this.error = ": Error:No existe la emergencia."
                }
			} catch (error) {
				console.log("error", error);
			}
		},
	},
}

    
</script>