---
permalink: /
title: ""
---

<nav id="menu-small" class="hide-on-big">
	{% for nav in site.data.navigation %}
		{% capture navurl %}{{ nav.url | prepend: '/'}}{% endcapture %}
		<a href='{{ site.baseurl }}/{{ nav.url }}'>{{ nav.title }}</a> 
	{% endfor %}
</nav>

<section id="infball" data-semester="100">
    <h2>Informatics Ball - 8th April - Deadline 2nd March<a class="link-icon" href="http://comp-soc.com/infball"><i class="fa fa-link" aria-hidden="true"></i></a>
    </h2>
    <p>
		It's after SDP, and it's after PROJ. If you're in Edinburgh, you can definitely make it. <a href="https://comp-soc.com/infball">More information here.</a>
    </p>

</section>
