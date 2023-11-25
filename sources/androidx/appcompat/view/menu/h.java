package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.m;

/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: f  reason: collision with root package name */
    private g f1138f;

    /* renamed from: m  reason: collision with root package name */
    private androidx.appcompat.app.c f1139m;

    /* renamed from: p  reason: collision with root package name */
    e f1140p;

    /* renamed from: q  reason: collision with root package name */
    private m.a f1141q;

    public h(g gVar) {
        this.f1138f = gVar;
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void a(g gVar, boolean z10) {
        if (z10 || gVar == this.f1138f) {
            c();
        }
        m.a aVar = this.f1141q;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean b(g gVar) {
        m.a aVar = this.f1141q;
        if (aVar != null) {
            return aVar.b(gVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.c cVar = this.f1139m;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        g gVar = this.f1138f;
        c.a aVar = new c.a(gVar.u());
        e eVar = new e(aVar.b(), g.g.f15801j);
        this.f1140p = eVar;
        eVar.h(this);
        this.f1138f.b(this.f1140p);
        aVar.c(this.f1140p.b(), this);
        View y10 = gVar.y();
        if (y10 != null) {
            aVar.d(y10);
        } else {
            aVar.e(gVar.w()).m(gVar.x());
        }
        aVar.i(this);
        androidx.appcompat.app.c a10 = aVar.a();
        this.f1139m = a10;
        a10.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1139m.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1139m.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f1138f.L((i) this.f1140p.b().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1140p.a(this.f1138f, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1139m.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1139m.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1138f.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1138f.performShortcut(i10, keyEvent, 0);
    }
}
