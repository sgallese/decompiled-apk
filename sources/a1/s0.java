package a1;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* compiled from: AndroidPathMeasure.android.kt */
/* loaded from: classes.dex */
public final class s0 implements h4 {

    /* renamed from: a  reason: collision with root package name */
    private final PathMeasure f184a;

    public s0(PathMeasure pathMeasure) {
        qc.q.i(pathMeasure, "internalPathMeasure");
        this.f184a = pathMeasure;
    }

    @Override // a1.h4
    public void a(e4 e4Var, boolean z10) {
        Path path;
        PathMeasure pathMeasure = this.f184a;
        if (e4Var != null) {
            if (e4Var instanceof p0) {
                path = ((p0) e4Var).u();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            path = null;
        }
        pathMeasure.setPath(path, z10);
    }

    @Override // a1.h4
    public boolean b(float f10, float f11, e4 e4Var, boolean z10) {
        qc.q.i(e4Var, "destination");
        PathMeasure pathMeasure = this.f184a;
        if (e4Var instanceof p0) {
            return pathMeasure.getSegment(f10, f11, ((p0) e4Var).u(), z10);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // a1.h4
    public float c() {
        return this.f184a.getLength();
    }
}
