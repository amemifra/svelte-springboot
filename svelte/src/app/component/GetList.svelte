<script>
  let promise = getList();

  async function getList() {
    const res = await fetch(`list`);
		const text = await res.json();

		if (res.ok) {
			return text;
		} else {
			throw new Error(text);
		} 
  }
</script>

{#await promise}
	<p>...waiting</p>
{:then response}
	{#each response as element}
	  <p>The number is {element}</p>
	{/each}
{:catch error}
	<p style="color: red">{error.message}</p>
{/await}
