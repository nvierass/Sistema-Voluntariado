<template>
    <nuxt-link :to="'/instituciones/'+id_institucion">
        <div class="institucion">
            <p>{{index}}. {{nombre}}</p>
        </div>
    </nuxt-link>
</template>
<script>
export default{
    name: 'Institucion',
    props: ['index','id_institucion', 'nombre']
}
</script>

<style>
    .institucion{
        padding: 1rem;
        border: 1px solid whitesmoke;
        margin: 1rem 0;
    }

    .institucion:hover {
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
