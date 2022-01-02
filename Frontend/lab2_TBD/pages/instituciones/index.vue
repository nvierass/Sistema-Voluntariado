<template>
	<div>
		<h1>Instituciones</h1>
		<Institucion
        v-for="(institucion,index) of instituciones" 
        :key= index
		:index = index+1
        :id_institucion = institucion.id_institucion
        :nombre= institucion.nombre
    />
	</div>
</template>

<script>
import Institucion from "../../components/institucion.vue";
export default {
	name: "InstitutionsPage",
  components: {
      Institucion
  },
	head() {
		return {
			title: "Gestión de Voluntariado | Instituciones",
		};
	},
	data() {
		return {
			instituciones: [],
		};
	},

	created() {
		this.getInstituciones();
	},

	methods: {
		getInstituciones: async function () {
			try {
				let response = await this.$axios.get("/instituciones/");
				this.instituciones = response.data;
			} catch (error) {
				console.log("error", error);
			}
		},
	},
};
</script>

