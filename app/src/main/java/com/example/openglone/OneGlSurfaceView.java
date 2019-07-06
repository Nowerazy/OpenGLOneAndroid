package com.example.openglone;

import android.content.Context;
import android.opengl.GLSurfaceView;

import com.example.openglone.Render.GlRender;

public class OneGlSurfaceView extends GLSurfaceView {
    private final GlRender mRenderer;

    public OneGlSurfaceView(Context context) {
        super(context);
        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);
        mRenderer = new GlRender();
        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(mRenderer);
    }
}
