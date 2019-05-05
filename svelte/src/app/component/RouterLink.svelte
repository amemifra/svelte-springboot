<script>
  export let url;
</script>

<style>
  a {
    color: var(--second-color-4);
  }  
</style>

<a href="#/{url}">
  <slot></slot>
</a>