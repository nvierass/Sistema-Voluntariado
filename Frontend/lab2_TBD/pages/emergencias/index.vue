<template>
	<div>
		<h1>Emergencias</h1>
		<Emergencia
        v-for="(emergencia,index) of emergencias" 
        :key= index
		:index = index+1
        :id_emergencia = emergencia.id_emergencia
        :descripcion= emergencia.descripcion
        :ciudad = emergencia.ciudad
    />
	</div>
</template>

<script>
import Emergencia from "../../components/emergencia.vue";
export default {
	name: "EmergenciesPage",
  components: {
      Emergencia
  },
	head() {
		return {
			title: "Gestión de Voluntariado | Emergencias",
		};
	},
	data() {
		return {
			emergencias: [],
		};
	},

	created() {
		this.getEmergencias();
	},

	methods: {
		getEmergencias: async function () {
			try {
				let response = await this.$axios.get("/emergencias/");
				this.emergencias = response.data;
			} catch (error) {
				console.log("error", error);
			}
		},
	},
};
</script>
