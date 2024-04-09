import com.microsoft.playwright.*

fun main() {
    Playwright.create().use { playwright ->
        val browser = playwright.chromium().launch()
        val page = browser.newPage()
        page.navigate("http://playwright.dev")
        println(page.title())
        browser.close()
    }
}
