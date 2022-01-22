<template>
    <div class="tarea">
        <p>{{index}}. Nombre: {{nombre}}</p>
        <p>ID: {{id_tarea}}</p>
        <p>Voluntarios requeridos: {{voluntarios_requeridos}}</p>
        <p>Estado: {{estado_tarea}}</p>
    </div>
</template>
<script>
export default{
    name: 'TareaVoluntario',
    props: ['index','id_tarea', 'nombre','voluntarios_requeridos','estado_tarea']
}
</script>

<style>
    .tarea{
        padding: 1rem;
        border: 1px solid whitesmoke;
        margin: 1rem 0;
    }
    .tarea:hover {
        background: #2d3436;
        border: 1px solid #6c5ce7;
        cursor: pointer;
    }
</style>