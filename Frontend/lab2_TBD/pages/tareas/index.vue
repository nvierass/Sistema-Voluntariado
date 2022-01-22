<template>
	<div>
		<h1>Tareas </h1>
		<button class="test" v-on:click="handleRanking">Generar Rankings</button>
		<Tarea
        v-for="(tarea,index) of tareas" 
        :key= index
		:index = index+1
        :id_tarea = tarea.id_tarea
        :nombre= tarea.nombre
        :descripcion = tarea.descripcion
    	/>
	</div>
</template>

<script>
import Tarea from "../../components/tarea.vue";
export default {
	name: "TasksPage",
  components: {
      Tarea
  },
	head() {
		return {
			title: "Gestión de Voluntariado | Tareas",
		};
	},
	data() {
		return {
			tareas: [],
		};
	},

	created() {
		this.getTareas();
	},

	methods: {
		getTareas: async function () {
			try {
				let response = await this.$axios.get("/tareas/");
				this.tareas = response.data;
			} catch (error) {
				console.log("error", error);
			}
		},
		handleRanking: async function(){
            try {
				let response = await this.$axios.get("/tareas/all/rankings");
				alert(response.data);
			} catch (error) {
				console.log("error", error);
			}
        }
	},
};
</script>

