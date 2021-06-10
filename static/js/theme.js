window.onload = function() {
  const getTheme = window.localStorage && window.localStorage.getItem("theme");
  const isDark = getTheme === "dark";

  if (getTheme !== null) {
    document.documentElement.classList.toggle("dark-theme", isDark);
  }

  const themeBtn = document.querySelector("#theme-toggle");

  themeBtn.addEventListener("click", () => {
    document.documentElement.classList.toggle("dark-theme");
    window.localStorage &&
      window.localStorage.setItem(
        "theme",
        document.documentElement.classList.contains("dark-theme") ? "dark" : "light",
      );
  });
}