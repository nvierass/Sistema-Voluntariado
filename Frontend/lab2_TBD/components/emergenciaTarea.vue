<template>
        <div class="emergencia">
        <p>{{index}}. Nombre: {{nombre_emergencia}}</p>
        <p>ID: {{id_emergencia}}</p>
        <p>Estado: {{estado_emergencia}}</p>
    </div>
</template>
<script>
export default{
    name: 'EmergenciaTarea',
    props: ['index','id_emergencia', 'nombre_emergencia','estado_emergencia']
}
</script>

<style>
    .emergencia{
        padding: 1rem;
        border: 1px solid whitesmoke;
        margin: 1rem 0;
    }
    .emergencia:hover {
        background: #2d3436;
        border: 1px solid #6c5ce7;
        cursor: pointer;
    }
</style>

