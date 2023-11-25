package a1;

import android.graphics.Shader;

/* compiled from: Brush.kt */
/* loaded from: classes.dex */
public final class f1 {

    /* compiled from: Brush.kt */
    /* loaded from: classes.dex */
    public static final class a extends m4 {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Shader f101e;

        a(Shader shader) {
            this.f101e = shader;
        }

        @Override // a1.m4
        public Shader b(long j10) {
            return this.f101e;
        }
    }

    public static final m4 a(Shader shader) {
        qc.q.i(shader, "shader");
        return new a(shader);
    }
}
