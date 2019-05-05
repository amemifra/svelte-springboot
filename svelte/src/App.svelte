<script>
	import Router from './app/routing/Router.svelte';
	import Sidenav from './app/component/Sidenav.svelte';
</script>

<style>
  .app-shell {
    position: absolute;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    display: flex;
  }
</style>

<div class="app-shell">
  <Sidenav class="sidenav" />
  <Router />
</div>