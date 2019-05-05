<script>
  import { hash } from '../services/route.serv'
  import Homepage from '../pages/Homepage.svelte';
  import Notfound from '../pages/Notfound.svelte';

  let value = Notfound;

  hash.subscribe( valu => {
    switch(valu) {
      case '':
        value = Homepage;
        break;
      default:
        value = Notfound;
    }
  });
</script>

<style>
  main {
    flex-grow: 1;
    background-color: var(--primary-color-2);
    color: var(--second-color);
    padding: 1rem;
  }
</style>

<main>
  <svelte:component this={value}/>
</main>
