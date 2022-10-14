import org.lwjgl.opengl.GL
import org.lwjgl.opengl.GL11.*
import org.lwjgl.system.MemoryUtil.NULL
import org.lwjgl.glfw.GLFW.*
import org.lwjgl.glfw.GLFWErrorCallback
import org.lwjgl.glfw.GLFWKeyCallback
import org.lwjgl.glfw.GLFWVulkan.glfwVulkanSupported

fun main(){
	    
	val WINDOW_SIZE = Pair(1280,700)

	// Return error if not Initialized

	if (glfwInit() == false){
		throw IllegalStateException("GLFW Initialization Error")
		}
	// Check for Vulkan support

	if (glfwVulkanSupported()){
		println("Vulcan is supported")
	}

	// Configure the Window
	
	glfwDefaultWindowHints()
	glfwWindowHint(GLFW_VISIBLE, GLFW_TRUE)
	glfwWindowHint(GLFW_RESIZABLE, GLFW_FALSE)
	
	// Create the window

	var window:Long = glfwCreateWindow(WINDOW_SIZE.first, WINDOW_SIZE.second, "Light-Weight Game Development Library for Kotlin", NULL, NULL)
	if (window == NULL) {
		throw RuntimeException("Failed to create the GLFW window")
	}
	

	glfwMakeContextCurrent(window)
	GL.createCapabilities()
	glfwShowWindow(window)
	
	while (glfwWindowShouldClose(window) == false ){
		glClear(GL_COLOR_BUFFER_BIT)
		glfwSwapBuffers(window)
		glfwPollEvents()
	}
	glfwTerminate()
}
