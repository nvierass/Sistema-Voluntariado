<template>
	<div class='div-emergencias'>
		<div class ='col'>
			<h1> Emergencias </h1>
			<EmergenciaTarea
			v-for="(emergencia,index) of emergencias" 
			v-on:click.native="getTareasEmergencia(emergencia.id_emergencia)"
			:key= index
			:index = index+1
			:id_emergencia = emergencia.id_emergencia
			:nombre_emergencia = emergencia.nombre_emergencia
			:estado_emergencia = emergencia.estado_emergencia
			/>
		</div>
		<div class ='col'>
			<h1> Tareas </h1>
			<TareaVoluntario
			v-for="(tarea,index) of tareas" 
			v-on:click.native="getVoluntariosTarea(tarea.id_tarea)"
			:key= index
			:index = index+1
			:id_tarea = tarea.id_tarea
			:nombre= tarea.nombre
			:voluntarios_requeridos = tarea.voluntarios_requeridos
			:estado_tarea = tarea.estado_tarea
			/>
		</div>	
		<div class ='col'>
			<h1> Voluntarios </h1>
			<VoluntarioInscrito
			v-for="(voluntario,index) of voluntarios" 
			:key= index
			:index = index+1
			:nombre= voluntario.nombre
			:rut = voluntario.rut
			:aceptado = voluntario.aceptado
			/>
		</div>		
	</div>
	<!-- <div>
		<h1>Emergencias</h1>
		<Emergencia
        v-for="(emergencia,index) of emergencias" 
        :key= index
		:index = index+1
        :id_emergencia = emergencia.id_emergencia
        :descripcion= emergencia.descripcion
        :ciudad = emergencia.ciudad
    	/>
	</div> -->
</template>

<script>
import EmergenciaTarea from "../../components/emergenciaTarea.vue";
import TareaVoluntario from "../../components/tareaVoluntario.vue";
import VoluntarioInscrito from "../../components/voluntarioInscrito.vue";
export default {
	name: "EmergenciesPage",
  components: {
      EmergenciaTarea,
	  TareaVoluntario,
	  VoluntarioInscrito
  },
	head() {
		return {
			title: "Gestión de Voluntariado | Emergencias",
		};
	},
	data() {
		return {
			emergencias: [],
			tareas: [],
			voluntarios: []
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
		getTareasEmergencia: async function (id_emergencia){
			this.tareas=[];
			this.voluntarios=[];
			try {
				let response = await this.$axios.get("/tareas_emergencia=" + id_emergencia);
				this.tareas = response.data;
			} catch (error) {
				console.log("error", error);
			}
		},
		getVoluntariosTarea: async function (id_tarea){
			this.voluntarios=[];
			try {
				let response = await this.$axios.get("/voluntarios_tarea=" + id_tarea);
				this.voluntarios = response.data;
			} catch (error) {
				console.log("error", error);
			}
		},
	},
};
</script>

<style>
	.col {
  		float: left;
  		width: 33.33%;
		padding: 2rem 2rem;
	}
	.div-emergencias:after {
  		content: "";
  		display: table;
 		clear: both;
	}	
</style>