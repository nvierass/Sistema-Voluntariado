<template>
	<div>
		<h1>Voluntarios</h1>
		<Voluntario
        v-for="(voluntario,index) of voluntarios" 
        :key= index
		:index = index+1
        :id_voluntario = voluntario.id_voluntario
        :nombre= voluntario.nombre
        :inscrito= true
        :rut = voluntario.rut
        :ciudad = voluntario.ciudad
        :region = voluntario.region
        :edad = voluntario.edad
    />
	</div>
</template>

<script>
import Voluntario from "../../../components/voluntario.vue";
export default {
  components: {
      Voluntario,
  },
	head() {
		return {
			title: "Gestión de Voluntariado | Tareas | Voluntarios inscritos",
		};
	},
	data() {
		return {
			voluntarios: [],
		};
	},

	created() {
		this.getVoluntarios();
	},

	methods: {
		getVoluntarios: async function () {
			try {
				let response = await this.$axios.get("/tareas/"+this.$route.params.id+"/voluntarios/");
				this.voluntarios = response.data;
			} catch (error) {
				console.log("error", error);
			}
		},
	},
};
</script>