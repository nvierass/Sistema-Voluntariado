<template>
	<div>
		<h1>Voluntarios</h1>
		<Voluntario
        v-for="(voluntario,index) of voluntarios" 
        :key= index
		    :index = index+1
        :id_voluntario = voluntario.id_voluntario
        :nombre= voluntario.nombre
        :inscrito= false
        :rut = null
        :ciudad = null
        :region = null
        :edad = null
    />
	</div>
</template>

<script>
import Voluntario from "../../components/voluntario.vue";
export default {
	name: "VoluntariesPage",
  	components: {
      Voluntario
  	},
	head() {
		return {
			title: "Gestión de Voluntariado | Voluntarios",
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
				let response = await this.$axios.get("/voluntarios/");
				this.voluntarios = response.data;
			} catch (error) {
				console.log("error", error);
			}
		},
	},
};
</script>