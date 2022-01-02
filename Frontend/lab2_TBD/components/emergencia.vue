<template>
    <nuxt-link :to="'/emergencias/'+id_emergencia">
        <div class="emergencia">
            <p>{{index}}. {{ciudad}} - {{descripcion}}</p>
        </div>
    </nuxt-link>
</template>
<script>
export default{
    name: 'Emergencia',
    props: ['index','id_emergencia', 'descripcion','ciudad']
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

    a{
        color: whitesmoke;
        text-decoration: none;
    }

    a:hover{
        color:#6c5ce7;
    }

</style>