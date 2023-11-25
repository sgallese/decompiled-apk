package b2;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.recyclerview.widget.RecyclerView;
import b2.o;
import b2.u;
import b2.v;
import java.util.concurrent.Executor;
import okhttp3.internal.http2.Http2;

/* compiled from: TextInputServiceAndroid.android.kt */
/* loaded from: classes.dex */
public final class q0 {
    public static final Executor d(final Choreographer choreographer) {
        qc.q.i(choreographer, "<this>");
        return new Executor() { // from class: b2.o0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                q0.e(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, final Runnable runnable) {
        qc.q.i(choreographer, "$this_asExecutor");
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: b2.p0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                q0.f(runnable, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, long j10) {
        runnable.run();
    }

    private static final boolean g(int i10, int i11) {
        if ((i10 & i11) == i11) {
            return true;
        }
        return false;
    }

    public static final void h(EditorInfo editorInfo, p pVar, j0 j0Var) {
        qc.q.i(editorInfo, "<this>");
        qc.q.i(pVar, "imeOptions");
        qc.q.i(j0Var, "textFieldValue");
        int d10 = pVar.d();
        o.a aVar = o.f7817b;
        int i10 = 6;
        if (o.l(d10, aVar.a())) {
            if (!pVar.f()) {
                i10 = 0;
            }
        } else if (o.l(d10, aVar.e())) {
            i10 = 1;
        } else if (o.l(d10, aVar.c())) {
            i10 = 2;
        } else if (o.l(d10, aVar.d())) {
            i10 = 5;
        } else if (o.l(d10, aVar.f())) {
            i10 = 7;
        } else if (o.l(d10, aVar.g())) {
            i10 = 3;
        } else if (o.l(d10, aVar.h())) {
            i10 = 4;
        } else if (!o.l(d10, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i10;
        int e10 = pVar.e();
        v.a aVar2 = v.f7853a;
        if (v.k(e10, aVar2.h())) {
            editorInfo.inputType = 1;
        } else if (v.k(e10, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= RecyclerView.UNDEFINED_DURATION;
        } else if (v.k(e10, aVar2.d())) {
            editorInfo.inputType = 2;
        } else if (v.k(e10, aVar2.g())) {
            editorInfo.inputType = 3;
        } else if (v.k(e10, aVar2.i())) {
            editorInfo.inputType = 17;
        } else if (v.k(e10, aVar2.c())) {
            editorInfo.inputType = 33;
        } else if (v.k(e10, aVar2.f())) {
            editorInfo.inputType = 129;
        } else if (v.k(e10, aVar2.e())) {
            editorInfo.inputType = 18;
        } else if (v.k(e10, aVar2.b())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!pVar.f() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (o.l(pVar.d(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int c10 = pVar.c();
            u.a aVar3 = u.f7848a;
            if (u.f(c10, aVar3.a())) {
                editorInfo.inputType |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
            } else if (u.f(c10, aVar3.d())) {
                editorInfo.inputType |= 8192;
            } else if (u.f(c10, aVar3.c())) {
                editorInfo.inputType |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (pVar.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = v1.i0.n(j0Var.g());
        editorInfo.initialSelEnd = v1.i0.i(j0Var.g());
        v2.c.f(editorInfo, j0Var.h());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (!androidx.emoji2.text.f.k()) {
            return;
        }
        androidx.emoji2.text.f.c().x(editorInfo);
    }
}
