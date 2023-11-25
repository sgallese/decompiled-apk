package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public class c extends x implements DialogInterface {
    static final int LAYOUT_HINT_NONE = 0;
    static final int LAYOUT_HINT_SIDE = 1;
    final AlertController mAlert;

    /* compiled from: AlertDialog.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f771a;

        /* renamed from: b  reason: collision with root package name */
        private final int f772b;

        public a(Context context) {
            this(context, c.resolveDialogTheme(context, 0));
        }

        public c a() {
            c cVar = new c(this.f771a.f724a, this.f772b);
            this.f771a.a(cVar.mAlert);
            cVar.setCancelable(this.f771a.f741r);
            if (this.f771a.f741r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f771a.f742s);
            cVar.setOnDismissListener(this.f771a.f743t);
            DialogInterface.OnKeyListener onKeyListener = this.f771a.f744u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context b() {
            return this.f771a.f724a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f771a;
            fVar.f746w = listAdapter;
            fVar.f747x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f771a.f730g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f771a.f727d = drawable;
            return this;
        }

        public a f(CharSequence charSequence) {
            this.f771a.f731h = charSequence;
            return this;
        }

        public a g(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f771a;
            fVar.f745v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f771a;
            fVar.f735l = charSequence;
            fVar.f737n = onClickListener;
            return this;
        }

        public a i(DialogInterface.OnKeyListener onKeyListener) {
            this.f771a.f744u = onKeyListener;
            return this;
        }

        public a j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f771a;
            fVar.f732i = charSequence;
            fVar.f734k = onClickListener;
            return this;
        }

        public a k(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f771a;
            fVar.f746w = listAdapter;
            fVar.f747x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a l(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f771a;
            fVar.f745v = charSequenceArr;
            fVar.f747x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a m(CharSequence charSequence) {
            this.f771a.f729f = charSequence;
            return this;
        }

        public a n(View view) {
            AlertController.f fVar = this.f771a;
            fVar.f749z = view;
            fVar.f748y = 0;
            fVar.E = false;
            return this;
        }

        public a(Context context, int i10) {
            this.f771a = new AlertController.f(new ContextThemeWrapper(context, c.resolveDialogTheme(context, i10)));
            this.f772b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Context context) {
        this(context, 0);
    }

    static int resolveDialogTheme(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(g.a.f15704o, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i10) {
        return this.mAlert.c(i10);
    }

    public ListView getListView() {
        return this.mAlert.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.x, androidx.activity.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mAlert.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.mAlert.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.mAlert.i(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void setButton(int i10, CharSequence charSequence, Message message) {
        this.mAlert.l(i10, charSequence, null, message, null);
    }

    void setButtonPanelLayoutHint(int i10) {
        this.mAlert.m(i10);
    }

    public void setCustomTitle(View view) {
        this.mAlert.n(view);
    }

    public void setIcon(int i10) {
        this.mAlert.o(i10);
    }

    public void setIconAttribute(int i10) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i10, typedValue, true);
        this.mAlert.o(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        this.mAlert.q(charSequence);
    }

    @Override // androidx.appcompat.app.x, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mAlert.s(charSequence);
    }

    public void setView(View view) {
        this.mAlert.u(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Context context, int i10) {
        super(context, resolveDialogTheme(context, i10));
        this.mAlert = new AlertController(getContext(), this, getWindow());
    }

    public void setButton(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.l(i10, charSequence, onClickListener, null, null);
    }

    public void setIcon(Drawable drawable) {
        this.mAlert.p(drawable);
    }

    public void setView(View view, int i10, int i11, int i12, int i13) {
        this.mAlert.v(view, i10, i11, i12, i13);
    }

    public void setButton(int i10, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.l(i10, charSequence, onClickListener, null, drawable);
    }

    protected c(Context context, boolean z10, DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z10);
        setOnCancelListener(onCancelListener);
    }
}
