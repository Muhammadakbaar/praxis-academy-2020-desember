<template>
    <nav class="navbar is-dark" role="navigation" aria-label="main navigation">
        <div class="container">
            <div class="navbar-brand">
                <a class="navbar-item" href="https://praxisacademy.id" target="newtab">
                    <img alt="Praxis Academy" src="../assets/GitHub-Mark-Light-120px-plus.png">
                </a>
                <a role="button" class="navbar-burger burger" aria-label="menu" aria-expanded="false" data-target="navbarBasicExample">
                    <span aria-hidden="true"></span>
                    <span aria-hidden="true"></span>
                    <span aria-hidden="true"></span>
                </a>
            </div>
            <div id="navbarBasicExample" class="navbar-menu">
                <div class="navbar-start">
                    <div class="navbar-item has-dropdown is-hoverable">
                        <a class="navbar-link">
                        Why Github?
                        </a>
                        <div class="navbar-dropdown">
                            <a class="navbar-item">
                                Plans
                            </a>
                            <a class="navbar-item">
                                Compare plans
                            </a>
                            <a class="navbar-item">
                                Contact Sales
                            </a>
                            <hr class="navbar-divider">
                            <a class="navbar-item">
                                Report an issue
                            </a>
                            <a href="#" class="navbar-item">
                                Nonprofit
                            </a>
                            <a href="#" class="navbar-item">
                                Education
                            </a>
                        </div>
                    </div>
                    <a href="/about" class="navbar-item">
                        Enterprise
                    </a>
                    <div class="navbar-item has-dropdown is-hoverable">
                        <a class="navbar-link">
                            Explore
                        </a>
                        <div class="navbar-dropdown">
                            <a class="navbar-item">
                                <strong>Explore GitHub</strong>
                            </a>
                            <a class="navbar-item">
                                Learn & contribute
                            </a>
                            <a class="navbar-item">
                                Topics
                            </a>
                            <a href="#" class="navbar-item">
                                Collections
                            </a>
                            <a href="#" class="navbar-item">
                                Trending
                            </a>
                            <a href="#" class="navbar-item">
                                Learning Lab
                            </a>
                            <a href="#" class="navbar-item">
                                Open source guides
                            </a>
                            <hr class="navbar-divider">
                            <a class="navbar-item">
                                Connect with others
                            </a>
                            <a href="#" class="navbar-item">
                                Events
                            </a>
                            <a href="#" class="navbar-item">
                                Community forum
                            </a>
                            <a href="#" class="navbar-item">
                                GitHub Education
                            </a>
                        </div>
                    </div>
                    <a href="#" class="navbar-item">
                        Marketplace
                    </a>
                    <div class="navbar-item has-dropdown is-hoverable">
                        <a class="navbar-link">
                            Pricing
                        </a>
                    <div class="navbar-dropdown">
                <a class="navbar-item">
            Plans
          </a>
          <a class="navbar-item">
            Compare plans
          </a>
          <a class="navbar-item">
            Contact Sales
          </a>
          <hr class="navbar-divider">
          <a class="navbar-item">
            Report an issue
          </a>
          <a href="#" class="navbar-item">
              Nonprofit
          </a>
          <a href="#" class="navbar-item">
              Education
          </a>
        </div>
      </div>
    </div>

    <div class="navbar-end">

<div class="navbar-item">
  <p class="control has-icons-right">
    <input class="input is-small" type="email" placeholder="Search">
    <span class="icon is-small is-right">
      /
    </span>
  </p>
</div>

      <div class="navbar-item">
        <div class="buttons">
          <a class="button is-light is-outlined">
            Sign in
          </a>
          <a class="button is-light is-outlined">
            Sign up
          </a>
        </div>
      </div>
    </div>
  </div>
        </div>
</nav>
</template>

<script>
export default {
    name: 'Header'
}
</script>