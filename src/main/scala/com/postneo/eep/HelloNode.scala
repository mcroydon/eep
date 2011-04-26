// A scala port of http://jmonkeyengine.org/wiki/doku.php/jme3:beginner:hello_node

package com.postneo
package eep

import com.jme3.app.SimpleApplication
import com.jme3.material.Material
import com.jme3.math.{ColorRGBA, Vector3f}
import com.jme3.scene.{Geometry, Node}
import com.jme3.scene.shape.Box

object HelloNode extends SimpleApplication {

    def main(args: Array[String]): Unit = {
        this.start()
    }

    override def simpleInitApp() = {
        // create a blue box at coordinates (1,-1,1)
        val box1 = new Box(new Vector3f(1,-1,1), 1,1,1)
        val blue = new Geometry("Box", box1)
        val mat1 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md")
        mat1.setColor("Color", ColorRGBA.Blue)
        blue.setMaterial(mat1)
        // create a red box straight above the blue one at (1,3,1)
        val box2 = new Box(new Vector3f(1,3,1), 1,1,1)
        val red = new Geometry("Box", box2)
        val mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md")
        mat2.setColor("Color", ColorRGBA.Red)
        red.setMaterial(mat2)
        // create a pivot node at (0,0,0) and attach it to root
        val pivot = new Node("pivot")
        rootNode.attachChild(pivot)
        // attach the two boxes to the *pivot* node!
        pivot.attachChild(blue)
        pivot.attachChild(red)
        // rotate pivot node: Both boxes have rotated!
        pivot.rotate(0.4f, 0.4f, 0.0f)
    }

}