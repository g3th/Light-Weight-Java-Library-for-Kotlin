import org.lwjgl.opengl.GL
import org.lwjgl.opengl.GL11.*
import org.lwjgl.system.MemoryUtil.NULL
import org.lwjgl.glfw.GLFW.*
import org.lwjgl.glfw.GLFWErrorCallback
import org.lwjgl.glfw.GLFWKeyCallback

fun main(){
	    
    val WINDOW_SIZE = Pair(800,600)
    
    // Return error if not Initialized
    
	if (glfwInit() == false){
		throw IllegalStateException("Unable to initialize GLFW")
		} 
    
    // Configure the Window
    glfwDefaultWindowHints()
    glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE)
    glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE)

    // Create the window
    var window:Long = glfwCreateWindow(WINDOW_SIZE.first, WINDOW_SIZE.second, "Hello World!", NULL, NULL)
    if (window == NULL) {
        throw RuntimeException("Failed to create the GLFW window")
    }
	
	glfwShowWindow(window)
	
	while (glfwWindowShouldClose(window) == false ){
		glfwSwapBuffers(window)
		glfwPollEvents()
		}
}
