---
permalink: /
title: ""
year: start
---

<nav id="menu-small" class="hide-on-big">
	{% for nav in site.data.navigation %}
		{% capture navurl %}{{ nav.url | prepend: '/'}}{% endcapture %}
		<a href='{{ site.baseurl }}/{{ nav.url }}'>{{ nav.title }}</a> 
	{% endfor %}
</nav>
