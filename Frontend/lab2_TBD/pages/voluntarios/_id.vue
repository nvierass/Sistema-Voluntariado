<template>
    <div class="card">
        <h1>Detalles del voluntario{{error}}</h1>
        <div class="info-voluntario">
            <p> ID Voluntario: {{voluntario.id_voluntario}}</p>
            <p> Nombre: {{voluntario.nombre}}</p>
            <p> RUT: {{voluntario.rut}}</p>
            <p> Teléfono de contacto: {{voluntario.telefono_contacto}}</p>
            <p> Correo: {{voluntario.correo}}</p>
            <h2>Ubicación</h2>
            <p> Región: {{voluntario.region}} </p>
            <p> Ciudad: {{voluntario.ciudad}} </p>
            <h2>Disponibilidad</h2>
            <p v-if="voluntario.disponibilidad_lunes"> Lunes</p>
            <p v-if="voluntario.disponibilidad_martes"> Martes</p>
            <p v-if="voluntario.disponibilidad_miercoles"> Miercoles</p>
            <p v-if="voluntario.disponibilidad_jueves"> Jueves</p>
            <p v-if="voluntario.disponibilidad_viernes"> Viernes</p>
            <p v-if="voluntario.disponibilidad_sabado"> Sabado</p>
            <p v-if="voluntario.disponibilidad_domingo"> Domingo</p>
        </div>
    </div>
</template>

<script>
export default {

    data(){
        return {
            voluntario: [],
            error: ""
        }
    },
    head() {
		return {
			title: "Gestión de Voluntariado | Voluntario",
		};
	},
    created() {
		this.getVoluntario();
	},

    methods: {
		getVoluntario: async function () {
			try {
				let response = await this.$axios.get("/voluntarios/" + this.$route.params.id);
				this.voluntario = response.data;
                if (response.data == ''){
                    this.error = ": Error:No existe el voluntario."
                }
			} catch (error) {
				console.log("error", error);
			}
		},
	},
}

    
</script>