package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.core.view.p0;

/* compiled from: MenuPopupHelper.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1181a;

    /* renamed from: b  reason: collision with root package name */
    private final g f1182b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1183c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1184d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1185e;

    /* renamed from: f  reason: collision with root package name */
    private View f1186f;

    /* renamed from: g  reason: collision with root package name */
    private int f1187g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1188h;

    /* renamed from: i  reason: collision with root package name */
    private m.a f1189i;

    /* renamed from: j  reason: collision with root package name */
    private k f1190j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1191k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f1192l;

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public l(Context context, g gVar, View view, boolean z10, int i10) {
        this(context, gVar, view, z10, i10, 0);
    }

    private k a() {
        boolean z10;
        k qVar;
        Display defaultDisplay = ((WindowManager) this.f1181a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        if (Math.min(point.x, point.y) >= this.f1181a.getResources().getDimensionPixelSize(g.d.f15727c)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            qVar = new d(this.f1181a, this.f1186f, this.f1184d, this.f1185e, this.f1183c);
        } else {
            qVar = new q(this.f1181a, this.f1182b, this.f1186f, this.f1184d, this.f1185e, this.f1183c);
        }
        qVar.l(this.f1182b);
        qVar.u(this.f1192l);
        qVar.p(this.f1186f);
        qVar.h(this.f1189i);
        qVar.r(this.f1188h);
        qVar.s(this.f1187g);
        return qVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        k c10 = c();
        c10.v(z11);
        if (z10) {
            if ((androidx.core.view.p.b(this.f1187g, p0.E(this.f1186f)) & 7) == 5) {
                i10 -= this.f1186f.getWidth();
            }
            c10.t(i10);
            c10.w(i11);
            int i12 = (int) ((this.f1181a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.q(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.c();
    }

    public void b() {
        if (d()) {
            this.f1190j.dismiss();
        }
    }

    public k c() {
        if (this.f1190j == null) {
            this.f1190j = a();
        }
        return this.f1190j;
    }

    public boolean d() {
        k kVar = this.f1190j;
        if (kVar != null && kVar.b()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        this.f1190j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1191k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f1186f = view;
    }

    public void g(boolean z10) {
        this.f1188h = z10;
        k kVar = this.f1190j;
        if (kVar != null) {
            kVar.r(z10);
        }
    }

    public void h(int i10) {
        this.f1187g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1191k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f1189i = aVar;
        k kVar = this.f1190j;
        if (kVar != null) {
            kVar.h(aVar);
        }
    }

    public void k() {
        if (m()) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f1186f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f1186f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public l(Context context, g gVar, View view, boolean z10, int i10, int i11) {
        this.f1187g = 8388611;
        this.f1192l = new a();
        this.f1181a = context;
        this.f1182b = gVar;
        this.f1186f = view;
        this.f1183c = z10;
        this.f1184d = i10;
        this.f1185e = i11;
    }
}
