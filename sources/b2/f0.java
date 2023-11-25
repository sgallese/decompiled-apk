package b2;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RecordingInputConnection.android.kt */
/* loaded from: classes.dex */
public final class f0 implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    private final q f7758a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7759b;

    /* renamed from: c  reason: collision with root package name */
    private int f7760c;

    /* renamed from: d  reason: collision with root package name */
    private j0 f7761d;

    /* renamed from: e  reason: collision with root package name */
    private int f7762e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7763f;

    /* renamed from: g  reason: collision with root package name */
    private final List<f> f7764g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7765h;

    public f0(j0 j0Var, q qVar, boolean z10) {
        qc.q.i(j0Var, "initState");
        qc.q.i(qVar, "eventCallback");
        this.f7758a = qVar;
        this.f7759b = z10;
        this.f7761d = j0Var;
        this.f7764g = new ArrayList();
        this.f7765h = true;
    }

    private final void a(f fVar) {
        b();
        try {
            this.f7764g.add(fVar);
        } finally {
            c();
        }
    }

    private final boolean b() {
        this.f7760c++;
        return true;
    }

    private final boolean c() {
        List<? extends f> F0;
        int i10 = this.f7760c - 1;
        this.f7760c = i10;
        if (i10 == 0 && (!this.f7764g.isEmpty()) != false) {
            q qVar = this.f7758a;
            F0 = ec.b0.F0(this.f7764g);
            qVar.d(F0);
            this.f7764g.clear();
        }
        if (this.f7760c > 0) {
            return true;
        }
        return false;
    }

    private final void d(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f7765h;
        if (z10) {
            return b();
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f7765h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f7764g.clear();
        this.f7760c = 0;
        this.f7765h = false;
        this.f7758a.b(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f7765h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        qc.q.i(inputContentInfo, "inputContentInfo");
        boolean z10 = this.f7765h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f7765h;
        if (z10) {
            return this.f7759b;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f7765h;
        if (z10) {
            a(new b(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f7765h;
        if (z10) {
            a(new d(i10, i11));
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f7765h;
        if (z10) {
            a(new e(i10, i11));
            return true;
        }
        return z10;
    }

    public final void e(j0 j0Var) {
        qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f7761d = j0Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return c();
    }

    public final void f(j0 j0Var, r rVar) {
        int i10;
        qc.q.i(j0Var, "state");
        qc.q.i(rVar, "inputMethodManager");
        if (!this.f7765h) {
            return;
        }
        e(j0Var);
        if (this.f7763f) {
            rVar.a(this.f7762e, t.a(j0Var));
        }
        v1.i0 f10 = j0Var.f();
        int i11 = -1;
        if (f10 != null) {
            i10 = v1.i0.l(f10.r());
        } else {
            i10 = -1;
        }
        v1.i0 f11 = j0Var.f();
        if (f11 != null) {
            i11 = v1.i0.k(f11.r());
        }
        rVar.b(v1.i0.l(j0Var.g()), v1.i0.k(j0Var.g()), i10, i11);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f7765h;
        if (z10) {
            a(new k());
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f7761d.h(), v1.i0.l(this.f7761d.g()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = true;
        int i11 = 0;
        if ((i10 & 1) == 0) {
            z10 = false;
        }
        this.f7763f = z10;
        if (z10) {
            if (extractedTextRequest != null) {
                i11 = extractedTextRequest.token;
            }
            this.f7762e = i11;
        }
        return t.a(this.f7761d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        if (v1.i0.h(this.f7761d.g())) {
            return null;
        }
        return k0.a(this.f7761d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return k0.b(this.f7761d, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return k0.c(this.f7761d, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f7765h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case 16908319:
                    a(new i0(0, this.f7761d.h().length()));
                    break;
                case 16908320:
                    d(277);
                    break;
                case 16908321:
                    d(278);
                    break;
                case 16908322:
                    d(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int a10;
        boolean z10 = this.f7765h;
        if (z10) {
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        a10 = o.f7817b.c();
                        break;
                    case 3:
                        a10 = o.f7817b.g();
                        break;
                    case 4:
                        a10 = o.f7817b.h();
                        break;
                    case 5:
                        a10 = o.f7817b.d();
                        break;
                    case 6:
                        a10 = o.f7817b.b();
                        break;
                    case 7:
                        a10 = o.f7817b.f();
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        a10 = o.f7817b.a();
                        break;
                }
            } else {
                a10 = o.f7817b.a();
            }
            this.f7758a.c(a10);
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f7765h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        boolean z10 = this.f7765h;
        if (z10) {
            Log.w("RecordingIC", "requestCursorUpdates is not supported");
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        qc.q.i(keyEvent, "event");
        boolean z10 = this.f7765h;
        if (z10) {
            this.f7758a.a(keyEvent);
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f7765h;
        if (z10) {
            a(new g0(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f7765h;
        if (z10) {
            a(new h0(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f7765h;
        if (z10) {
            a(new i0(i10, i11));
            return true;
        }
        return z10;
    }
}
