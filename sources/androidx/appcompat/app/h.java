package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.b;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.q1;
import androidx.appcompat.widget.r1;
import androidx.core.content.res.h;
import androidx.core.view.p0;
import androidx.core.view.p1;
import androidx.core.view.q;
import androidx.core.view.x0;
import androidx.core.view.z0;
import androidx.lifecycle.p;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public class h extends androidx.appcompat.app.g implements g.a, LayoutInflater.Factory2 {
    final androidx.appcompat.app.e A;
    androidx.appcompat.app.a B;
    MenuInflater C;
    private CharSequence D;
    private androidx.appcompat.widget.h0 E;
    private C0012h F;
    private v G;
    androidx.appcompat.view.b H;
    ActionBarContextView I;
    PopupWindow J;
    Runnable K;
    x0 L;
    private boolean M;
    private boolean N;
    ViewGroup O;
    private TextView P;
    private View Q;
    private boolean R;
    private boolean S;
    boolean T;
    boolean U;
    boolean V;
    boolean W;
    boolean X;
    private boolean Y;
    private u[] Z;

    /* renamed from: a0  reason: collision with root package name */
    private u f817a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f818b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f819c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f820d0;

    /* renamed from: e0  reason: collision with root package name */
    boolean f821e0;

    /* renamed from: f0  reason: collision with root package name */
    private Configuration f822f0;

    /* renamed from: g0  reason: collision with root package name */
    private int f823g0;

    /* renamed from: h0  reason: collision with root package name */
    private int f824h0;

    /* renamed from: i0  reason: collision with root package name */
    private int f825i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f826j0;

    /* renamed from: k0  reason: collision with root package name */
    private q f827k0;

    /* renamed from: l0  reason: collision with root package name */
    private q f828l0;

    /* renamed from: m0  reason: collision with root package name */
    boolean f829m0;

    /* renamed from: n0  reason: collision with root package name */
    int f830n0;

    /* renamed from: o0  reason: collision with root package name */
    private final Runnable f831o0;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f832p0;

    /* renamed from: q0  reason: collision with root package name */
    private Rect f833q0;

    /* renamed from: r0  reason: collision with root package name */
    private Rect f834r0;

    /* renamed from: s0  reason: collision with root package name */
    private z f835s0;

    /* renamed from: t0  reason: collision with root package name */
    private d0 f836t0;

    /* renamed from: u0  reason: collision with root package name */
    private OnBackInvokedDispatcher f837u0;

    /* renamed from: v0  reason: collision with root package name */
    private OnBackInvokedCallback f838v0;

    /* renamed from: w  reason: collision with root package name */
    final Object f839w;

    /* renamed from: x  reason: collision with root package name */
    final Context f840x;

    /* renamed from: y  reason: collision with root package name */
    Window f841y;

    /* renamed from: z  reason: collision with root package name */
    private o f842z;

    /* renamed from: w0  reason: collision with root package name */
    private static final androidx.collection.g<String, Integer> f813w0 = new androidx.collection.g<>();

    /* renamed from: x0  reason: collision with root package name */
    private static final boolean f814x0 = false;

    /* renamed from: y0  reason: collision with root package name */
    private static final int[] f815y0 = {16842836};

    /* renamed from: z0  reason: collision with root package name */
    private static final boolean f816z0 = !"robolectric".equals(Build.FINGERPRINT);
    private static final boolean A0 = true;

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if ((hVar.f830n0 & 1) != 0) {
                hVar.k0(0);
            }
            h hVar2 = h.this;
            if ((hVar2.f830n0 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                hVar2.k0(108);
            }
            h hVar3 = h.this;
            hVar3.f829m0 = false;
            hVar3.f830n0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class b implements androidx.core.view.h0 {
        b() {
        }

        @Override // androidx.core.view.h0
        public p1 a(View view, p1 p1Var) {
            int l10 = p1Var.l();
            int g12 = h.this.g1(p1Var, null);
            if (l10 != g12) {
                p1Var = p1Var.p(p1Var.j(), g12, p1Var.k(), p1Var.i());
            }
            return p0.g0(view, p1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        class a extends z0 {
            a() {
            }

            @Override // androidx.core.view.y0
            public void b(View view) {
                h.this.I.setAlpha(1.0f);
                h.this.L.j(null);
                h.this.L = null;
            }

            @Override // androidx.core.view.z0, androidx.core.view.y0
            public void c(View view) {
                h.this.I.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.J.showAtLocation(hVar.I, 55, 0, 0);
            h.this.l0();
            if (h.this.W0()) {
                h.this.I.setAlpha(0.0f);
                h hVar2 = h.this;
                hVar2.L = p0.e(hVar2.I).b(1.0f);
                h.this.L.j(new a());
                return;
            }
            h.this.I.setAlpha(1.0f);
            h.this.I.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class e extends z0 {
        e() {
        }

        @Override // androidx.core.view.y0
        public void b(View view) {
            h.this.I.setAlpha(1.0f);
            h.this.L.j(null);
            h.this.L = null;
        }

        @Override // androidx.core.view.z0, androidx.core.view.y0
        public void c(View view) {
            h.this.I.setVisibility(0);
            if (h.this.I.getParent() instanceof View) {
                p0.r0((View) h.this.I.getParent());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    private class f implements b.InterfaceC0011b {
        f() {
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public boolean a() {
            androidx.appcompat.app.a s10 = h.this.s();
            if (s10 != null && (s10.i() & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public Context b() {
            return h.this.q0();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public void c(Drawable drawable, int i10) {
            androidx.appcompat.app.a s10 = h.this.s();
            if (s10 != null) {
                s10.A(drawable);
                s10.y(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public Drawable d() {
            g1 u10 = g1.u(b(), null, new int[]{g.a.D});
            Drawable g10 = u10.g(0);
            u10.w();
            return g10;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0011b
        public void e(int i10) {
            androidx.appcompat.app.a s10 = h.this.s();
            if (s10 != null) {
                s10.y(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public interface g {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0012h implements m.a {
        C0012h() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
            h.this.b0(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback x02 = h.this.x0();
            if (x02 != null) {
                x02.onMenuOpened(108, gVar);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class i implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f851a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        class a extends z0 {
            a() {
            }

            @Override // androidx.core.view.y0
            public void b(View view) {
                h.this.I.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.J;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.I.getParent() instanceof View) {
                    p0.r0((View) h.this.I.getParent());
                }
                h.this.I.k();
                h.this.L.j(null);
                h hVar2 = h.this;
                hVar2.L = null;
                p0.r0(hVar2.O);
            }
        }

        public i(b.a aVar) {
            this.f851a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f851a.a(bVar);
            h hVar = h.this;
            if (hVar.J != null) {
                hVar.f841y.getDecorView().removeCallbacks(h.this.K);
            }
            h hVar2 = h.this;
            if (hVar2.I != null) {
                hVar2.l0();
                h hVar3 = h.this;
                hVar3.L = p0.e(hVar3.I).b(0.0f);
                h.this.L.j(new a());
            }
            h hVar4 = h.this;
            androidx.appcompat.app.e eVar = hVar4.A;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(hVar4.H);
            }
            h hVar5 = h.this;
            hVar5.H = null;
            p0.r0(hVar5.O);
            h.this.e1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f851a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            p0.r0(h.this.O);
            return this.f851a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f851a.d(bVar, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class j {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }

        static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class k {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (!equals) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        static androidx.core.os.j b(Configuration configuration) {
            LocaleList locales;
            String languageTags;
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            return androidx.core.os.j.c(languageTags);
        }

        public static void c(androidx.core.os.j jVar) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(jVar.h());
            LocaleList.setDefault(forLanguageTags);
        }

        static void d(Configuration configuration, androidx.core.os.j jVar) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(jVar.h());
            configuration.setLocales(forLanguageTags);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            i10 = configuration.colorMode;
            int i18 = i10 & 3;
            i11 = configuration2.colorMode;
            if (i18 != (i11 & 3)) {
                i16 = configuration3.colorMode;
                i17 = configuration2.colorMode;
                configuration3.colorMode = i16 | (i17 & 3);
            }
            i12 = configuration.colorMode;
            int i19 = i12 & 12;
            i13 = configuration2.colorMode;
            if (i19 != (i13 & 12)) {
                i14 = configuration3.colorMode;
                i15 = configuration2.colorMode;
                configuration3.colorMode = i14 | (i15 & 12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class n {
        static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        static OnBackInvokedCallback b(Object obj, final h hVar) {
            Objects.requireNonNull(hVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.v
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    h.this.F0();
                }
            };
            androidx.appcompat.app.s.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.s.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.r.a(obj2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class p extends q {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f859c;

        p(Context context) {
            super();
            this.f859c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.h.q
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.q
        public int c() {
            if (k.a(this.f859c)) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.h.q
        public void d() {
            h.this.V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public abstract class q {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f861a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        q() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f861a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f840x.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f861a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f861a == null) {
                    this.f861a = new a();
                }
                h.this.f840x.registerReceiver(this.f861a, b10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class r extends q {

        /* renamed from: c  reason: collision with root package name */
        private final i0 f864c;

        r(i0 i0Var) {
            super();
            this.f864c = i0Var;
        }

        @Override // androidx.appcompat.app.h.q
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.q
        public int c() {
            if (this.f864c.d()) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.h.q
        public void d() {
            h.this.V();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    private static class s {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            if (i10 >= -5 && i11 >= -5 && i10 <= getWidth() + 5 && i11 <= getHeight() + 5) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!h.this.j0(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                h.this.d0(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(h.a.b(getContext(), i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static final class u {

        /* renamed from: a  reason: collision with root package name */
        int f867a;

        /* renamed from: b  reason: collision with root package name */
        int f868b;

        /* renamed from: c  reason: collision with root package name */
        int f869c;

        /* renamed from: d  reason: collision with root package name */
        int f870d;

        /* renamed from: e  reason: collision with root package name */
        int f871e;

        /* renamed from: f  reason: collision with root package name */
        int f872f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f873g;

        /* renamed from: h  reason: collision with root package name */
        View f874h;

        /* renamed from: i  reason: collision with root package name */
        View f875i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.g f876j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.e f877k;

        /* renamed from: l  reason: collision with root package name */
        Context f878l;

        /* renamed from: m  reason: collision with root package name */
        boolean f879m;

        /* renamed from: n  reason: collision with root package name */
        boolean f880n;

        /* renamed from: o  reason: collision with root package name */
        boolean f881o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f882p;

        /* renamed from: q  reason: collision with root package name */
        boolean f883q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f884r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f885s;

        u(int i10) {
            this.f867a = i10;
        }

        androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.f876j == null) {
                return null;
            }
            if (this.f877k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f878l, g.g.f15801j);
                this.f877k = eVar;
                eVar.h(aVar);
                this.f876j.b(this.f877k);
            }
            return this.f877k.c(this.f873g);
        }

        public boolean b() {
            if (this.f874h == null) {
                return false;
            }
            if (this.f875i == null && this.f877k.b().getCount() <= 0) {
                return false;
            }
            return true;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f876j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.O(this.f877k);
            }
            this.f876j = gVar;
            if (gVar != null && (eVar = this.f877k) != null) {
                gVar.b(eVar);
            }
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(g.a.f15690a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(g.a.H, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            } else {
                newTheme.applyStyle(g.i.f15829d, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f878l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(g.j.f15955y0);
            this.f868b = obtainStyledAttributes.getResourceId(g.j.B0, 0);
            this.f872f = obtainStyledAttributes.getResourceId(g.j.A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class v implements m.a {
        v() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
            boolean z11;
            androidx.appcompat.view.menu.g D = gVar.D();
            if (D != gVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            h hVar = h.this;
            if (z11) {
                gVar = D;
            }
            u o02 = hVar.o0(gVar);
            if (o02 != null) {
                if (z11) {
                    h.this.a0(o02.f867a, o02, D);
                    h.this.e0(o02, true);
                    return;
                }
                h.this.e0(o02, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback x02;
            if (gVar == gVar.D()) {
                h hVar = h.this;
                if (hVar.T && (x02 = hVar.x0()) != null && !h.this.f821e0) {
                    x02.onMenuOpened(108, gVar);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    private boolean A0(u uVar) {
        uVar.d(q0());
        uVar.f873g = new t(uVar.f878l);
        uVar.f869c = 81;
        return true;
    }

    private boolean B0(u uVar) {
        Resources.Theme theme;
        Context context = this.f840x;
        int i10 = uVar.f867a;
        if ((i10 == 0 || i10 == 108) && this.E != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(g.a.f15695f, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(g.a.f15696g, typedValue, true);
            } else {
                theme2.resolveAttribute(g.a.f15696g, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        uVar.c(gVar);
        return true;
    }

    private void C0(int i10) {
        this.f830n0 = (1 << i10) | this.f830n0;
        if (!this.f829m0) {
            p0.m0(this.f841y.getDecorView(), this.f831o0);
            this.f829m0 = true;
        }
    }

    private boolean H0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            u v02 = v0(i10, true);
            if (!v02.f881o) {
                return R0(v02, keyEvent);
            }
            return false;
        }
        return false;
    }

    private boolean K0(int i10, KeyEvent keyEvent) {
        boolean z10;
        androidx.appcompat.widget.h0 h0Var;
        if (this.H != null) {
            return false;
        }
        boolean z11 = true;
        u v02 = v0(i10, true);
        if (i10 == 0 && (h0Var = this.E) != null && h0Var.e() && !ViewConfiguration.get(this.f840x).hasPermanentMenuKey()) {
            if (!this.E.c()) {
                if (!this.f821e0 && R0(v02, keyEvent)) {
                    z11 = this.E.h();
                }
                z11 = false;
            } else {
                z11 = this.E.g();
            }
        } else {
            boolean z12 = v02.f881o;
            if (!z12 && !v02.f880n) {
                if (v02.f879m) {
                    if (v02.f884r) {
                        v02.f879m = false;
                        z10 = R0(v02, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        O0(v02, keyEvent);
                    }
                }
                z11 = false;
            } else {
                e0(v02, true);
                z11 = z12;
            }
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.f840x.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void O0(androidx.appcompat.app.h.u r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.O0(androidx.appcompat.app.h$u, android.view.KeyEvent):void");
    }

    private boolean Q0(u uVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.g gVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f879m || R0(uVar, keyEvent)) && (gVar = uVar.f876j) != null) {
            z10 = gVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.E == null) {
            e0(uVar, true);
        }
        return z10;
    }

    private boolean R0(u uVar, KeyEvent keyEvent) {
        boolean z10;
        androidx.appcompat.widget.h0 h0Var;
        int i10;
        boolean z11;
        androidx.appcompat.widget.h0 h0Var2;
        androidx.appcompat.widget.h0 h0Var3;
        if (this.f821e0) {
            return false;
        }
        if (uVar.f879m) {
            return true;
        }
        u uVar2 = this.f817a0;
        if (uVar2 != null && uVar2 != uVar) {
            e0(uVar2, false);
        }
        Window.Callback x02 = x0();
        if (x02 != null) {
            uVar.f875i = x02.onCreatePanelView(uVar.f867a);
        }
        int i11 = uVar.f867a;
        if (i11 != 0 && i11 != 108) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && (h0Var3 = this.E) != null) {
            h0Var3.d();
        }
        if (uVar.f875i == null && (!z10 || !(P0() instanceof g0))) {
            androidx.appcompat.view.menu.g gVar = uVar.f876j;
            if (gVar == null || uVar.f884r) {
                if (gVar == null && (!B0(uVar) || uVar.f876j == null)) {
                    return false;
                }
                if (z10 && this.E != null) {
                    if (this.F == null) {
                        this.F = new C0012h();
                    }
                    this.E.b(uVar.f876j, this.F);
                }
                uVar.f876j.d0();
                if (!x02.onCreatePanelMenu(uVar.f867a, uVar.f876j)) {
                    uVar.c(null);
                    if (z10 && (h0Var = this.E) != null) {
                        h0Var.b(null, this.F);
                    }
                    return false;
                }
                uVar.f884r = false;
            }
            uVar.f876j.d0();
            Bundle bundle = uVar.f885s;
            if (bundle != null) {
                uVar.f876j.P(bundle);
                uVar.f885s = null;
            }
            if (!x02.onPreparePanel(0, uVar.f875i, uVar.f876j)) {
                if (z10 && (h0Var2 = this.E) != null) {
                    h0Var2.b(null, this.F);
                }
                uVar.f876j.c0();
                return false;
            }
            if (keyEvent != null) {
                i10 = keyEvent.getDeviceId();
            } else {
                i10 = -1;
            }
            if (KeyCharacterMap.load(i10).getKeyboardType() != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            uVar.f882p = z11;
            uVar.f876j.setQwertyMode(z11);
            uVar.f876j.c0();
        }
        uVar.f879m = true;
        uVar.f880n = false;
        this.f817a0 = uVar;
        return true;
    }

    private void S0(boolean z10) {
        androidx.appcompat.widget.h0 h0Var = this.E;
        if (h0Var != null && h0Var.e() && (!ViewConfiguration.get(this.f840x).hasPermanentMenuKey() || this.E.f())) {
            Window.Callback x02 = x0();
            if (this.E.c() && z10) {
                this.E.g();
                if (!this.f821e0) {
                    x02.onPanelClosed(108, v0(0, true).f876j);
                    return;
                }
                return;
            } else if (x02 != null && !this.f821e0) {
                if (this.f829m0 && (this.f830n0 & 1) != 0) {
                    this.f841y.getDecorView().removeCallbacks(this.f831o0);
                    this.f831o0.run();
                }
                u v02 = v0(0, true);
                androidx.appcompat.view.menu.g gVar = v02.f876j;
                if (gVar != null && !v02.f884r && x02.onPreparePanel(0, v02.f875i, gVar)) {
                    x02.onMenuOpened(108, v02.f876j);
                    this.E.h();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        u v03 = v0(0, true);
        v03.f883q = true;
        e0(v03, false);
        O0(v03, null);
    }

    private boolean T(boolean z10) {
        return U(z10, true);
    }

    private int T0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i10;
        }
    }

    private boolean U(boolean z10, boolean z11) {
        androidx.core.os.j jVar;
        if (this.f821e0) {
            return false;
        }
        int Z = Z();
        int E0 = E0(this.f840x, Z);
        if (Build.VERSION.SDK_INT < 33) {
            jVar = Y(this.f840x);
        } else {
            jVar = null;
        }
        if (!z11 && jVar != null) {
            jVar = u0(this.f840x.getResources().getConfiguration());
        }
        boolean d12 = d1(E0, jVar, z10);
        if (Z == 0) {
            t0(this.f840x).e();
        } else {
            q qVar = this.f827k0;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (Z == 3) {
            s0(this.f840x).e();
        } else {
            q qVar2 = this.f828l0;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return d12;
    }

    private void W() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.O.findViewById(16908290);
        View decorView = this.f841y.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f840x.obtainStyledAttributes(g.j.f15955y0);
        obtainStyledAttributes.getValue(g.j.K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(g.j.L0, contentFrameLayout.getMinWidthMinor());
        int i10 = g.j.I0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = g.j.J0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = g.j.G0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = g.j.H0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void X(Window window) {
        if (this.f841y == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof o)) {
                o oVar = new o(callback);
                this.f842z = oVar;
                window.setCallback(oVar);
                g1 u10 = g1.u(this.f840x, null, f815y0);
                Drawable h10 = u10.h(0);
                if (h10 != null) {
                    window.setBackgroundDrawable(h10);
                }
                u10.w();
                this.f841y = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f837u0 == null) {
                    N(null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private boolean X0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f841y.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || p0.X((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int Z() {
        int i10 = this.f823g0;
        if (i10 == -100) {
            return androidx.appcompat.app.g.m();
        }
        return i10;
    }

    private void a1() {
        if (!this.N) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    private androidx.appcompat.app.d b1() {
        for (Context context = this.f840x; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void c0() {
        q qVar = this.f827k0;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.f828l0;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    private void c1(Configuration configuration) {
        Activity activity = (Activity) this.f839w;
        if (activity instanceof androidx.lifecycle.v) {
            if (((androidx.lifecycle.v) activity).getLifecycle().b().isAtLeast(p.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.f820d0 && !this.f821e0) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean d1(int r9, androidx.core.os.j r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f840x
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.f0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f840x
            int r1 = r8.r0(r1)
            android.content.res.Configuration r2 = r8.f822f0
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f840x
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.j r2 = r8.u0(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            androidx.core.os.j r0 = r8.u0(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.175E-43)
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r0 == 0) goto L47
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L47
            r2 = r3 | 4
            r3 = r2 | 8192(0x2000, float:1.14794E-41)
        L47:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L71
            if (r11 == 0) goto L71
            boolean r11 = r8.f819c0
            if (r11 == 0) goto L71
            boolean r11 = androidx.appcompat.app.h.f816z0
            if (r11 != 0) goto L5a
            boolean r11 = r8.f820d0
            if (r11 == 0) goto L71
        L5a:
            java.lang.Object r11 = r8.f839w
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L71
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L71
            java.lang.Object r11 = r8.f839w
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.b.t(r11)
            r11 = 1
            goto L72
        L71:
            r11 = 0
        L72:
            if (r11 != 0) goto L7f
            if (r3 == 0) goto L7f
            r11 = r3 & r1
            if (r11 != r3) goto L7b
            r6 = 1
        L7b:
            r8.f1(r4, r0, r6, r5)
            goto L80
        L7f:
            r7 = r11
        L80:
            if (r7 == 0) goto L9c
            java.lang.Object r11 = r8.f839w
            boolean r1 = r11 instanceof androidx.appcompat.app.d
            if (r1 == 0) goto L9c
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L91
            androidx.appcompat.app.d r11 = (androidx.appcompat.app.d) r11
            r11.onNightModeChanged(r9)
        L91:
            r9 = r3 & 4
            if (r9 == 0) goto L9c
            java.lang.Object r9 = r8.f839w
            androidx.appcompat.app.d r9 = (androidx.appcompat.app.d) r9
            r9.onLocalesChanged(r10)
        L9c:
            if (r7 == 0) goto Lb1
            if (r0 == 0) goto Lb1
            android.content.Context r9 = r8.f840x
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.j r9 = r8.u0(r9)
            r8.V0(r9)
        Lb1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.d1(int, androidx.core.os.j, boolean):boolean");
    }

    private Configuration f0(Context context, int i10, androidx.core.os.j jVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i11 = 32;
            }
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (jVar != null) {
            U0(configuration2, jVar);
        }
        return configuration2;
    }

    private void f1(int i10, androidx.core.os.j jVar, boolean z10, Configuration configuration) {
        Resources resources = this.f840x.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (jVar != null) {
            U0(configuration2, jVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            f0.a(resources);
        }
        int i12 = this.f824h0;
        if (i12 != 0) {
            this.f840x.setTheme(i12);
            if (i11 >= 23) {
                this.f840x.getTheme().applyStyle(this.f824h0, true);
            }
        }
        if (z10 && (this.f839w instanceof Activity)) {
            c1(configuration2);
        }
    }

    private ViewGroup g0() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f840x.obtainStyledAttributes(g.j.f15955y0);
        int i10 = g.j.D0;
        if (obtainStyledAttributes.hasValue(i10)) {
            if (obtainStyledAttributes.getBoolean(g.j.M0, false)) {
                H(1);
            } else if (obtainStyledAttributes.getBoolean(i10, false)) {
                H(108);
            }
            if (obtainStyledAttributes.getBoolean(g.j.E0, false)) {
                H(109);
            }
            if (obtainStyledAttributes.getBoolean(g.j.F0, false)) {
                H(10);
            }
            this.W = obtainStyledAttributes.getBoolean(g.j.f15960z0, false);
            obtainStyledAttributes.recycle();
            n0();
            this.f841y.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f840x);
            if (!this.X) {
                if (this.W) {
                    viewGroup = (ViewGroup) from.inflate(g.g.f15797f, (ViewGroup) null);
                    this.U = false;
                    this.T = false;
                } else if (this.T) {
                    TypedValue typedValue = new TypedValue();
                    this.f840x.getTheme().resolveAttribute(g.a.f15695f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new androidx.appcompat.view.d(this.f840x, typedValue.resourceId);
                    } else {
                        context = this.f840x;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(g.g.f15807p, (ViewGroup) null);
                    androidx.appcompat.widget.h0 h0Var = (androidx.appcompat.widget.h0) viewGroup.findViewById(g.f.f15781p);
                    this.E = h0Var;
                    h0Var.setWindowCallback(x0());
                    if (this.U) {
                        this.E.i(109);
                    }
                    if (this.R) {
                        this.E.i(2);
                    }
                    if (this.S) {
                        this.E.i(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.V ? (ViewGroup) from.inflate(g.g.f15806o, (ViewGroup) null) : (ViewGroup) from.inflate(g.g.f15805n, (ViewGroup) null);
            }
            if (viewGroup != null) {
                p0.J0(viewGroup, new b());
                if (this.E == null) {
                    this.P = (TextView) viewGroup.findViewById(g.f.M);
                }
                r1.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(g.f.f15767b);
                ViewGroup viewGroup2 = (ViewGroup) this.f841y.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f841y.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.T + ", windowActionBarOverlay: " + this.U + ", android:windowIsFloating: " + this.W + ", windowActionModeOverlay: " + this.V + ", windowNoTitle: " + this.X + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void h1(View view) {
        boolean z10;
        int c10;
        if ((p0.Q(view) & 8192) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c10 = androidx.core.content.a.c(this.f840x, g.c.f15718b);
        } else {
            c10 = androidx.core.content.a.c(this.f840x, g.c.f15717a);
        }
        view.setBackgroundColor(c10);
    }

    private void m0() {
        if (!this.N) {
            this.O = g0();
            CharSequence w02 = w0();
            if (!TextUtils.isEmpty(w02)) {
                androidx.appcompat.widget.h0 h0Var = this.E;
                if (h0Var != null) {
                    h0Var.setWindowTitle(w02);
                } else if (P0() != null) {
                    P0().F(w02);
                } else {
                    TextView textView = this.P;
                    if (textView != null) {
                        textView.setText(w02);
                    }
                }
            }
            W();
            N0(this.O);
            this.N = true;
            u v02 = v0(0, false);
            if (!this.f821e0) {
                if (v02 == null || v02.f876j == null) {
                    C0(108);
                }
            }
        }
    }

    private void n0() {
        if (this.f841y == null) {
            Object obj = this.f839w;
            if (obj instanceof Activity) {
                X(((Activity) obj).getWindow());
            }
        }
        if (this.f841y != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    private static Configuration p0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                l.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                m.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            j.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private int r0(Context context) {
        int i10;
        if (!this.f826j0 && (this.f839w instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    i10 = 269221888;
                } else if (i11 >= 24) {
                    i10 = 786432;
                } else {
                    i10 = 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f839w.getClass()), i10);
                if (activityInfo != null) {
                    this.f825i0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f825i0 = 0;
            }
        }
        this.f826j0 = true;
        return this.f825i0;
    }

    private q s0(Context context) {
        if (this.f828l0 == null) {
            this.f828l0 = new p(context);
        }
        return this.f828l0;
    }

    private q t0(Context context) {
        if (this.f827k0 == null) {
            this.f827k0 = new r(i0.a(context));
        }
        return this.f827k0;
    }

    private void y0() {
        m0();
        if (this.T && this.B == null) {
            Object obj = this.f839w;
            if (obj instanceof Activity) {
                this.B = new j0((Activity) this.f839w, this.U);
            } else if (obj instanceof Dialog) {
                this.B = new j0((Dialog) this.f839w);
            }
            androidx.appcompat.app.a aVar = this.B;
            if (aVar != null) {
                aVar.s(this.f832p0);
            }
        }
    }

    private boolean z0(u uVar) {
        View view = uVar.f875i;
        if (view != null) {
            uVar.f874h = view;
            return true;
        } else if (uVar.f876j == null) {
            return false;
        } else {
            if (this.G == null) {
                this.G = new v();
            }
            View view2 = (View) uVar.a(this.G);
            uVar.f874h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.appcompat.app.g
    public void A(Bundle bundle) {
        m0();
    }

    @Override // androidx.appcompat.app.g
    public void B() {
        androidx.appcompat.app.a s10 = s();
        if (s10 != null) {
            s10.C(true);
        }
    }

    @Override // androidx.appcompat.app.g
    public void D() {
        U(true, false);
    }

    public boolean D0() {
        return this.M;
    }

    @Override // androidx.appcompat.app.g
    public void E() {
        androidx.appcompat.app.a s10 = s();
        if (s10 != null) {
            s10.C(false);
        }
    }

    int E0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        return s0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return t0(context).c();
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean F0() {
        boolean z10 = this.f818b0;
        this.f818b0 = false;
        u v02 = v0(0, false);
        if (v02 != null && v02.f881o) {
            if (!z10) {
                e0(v02, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.H;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a s10 = s();
        if (s10 == null || !s10.g()) {
            return false;
        }
        return true;
    }

    boolean G0(int i10, KeyEvent keyEvent) {
        boolean z10 = true;
        if (i10 != 4) {
            if (i10 == 82) {
                H0(0, keyEvent);
                return true;
            }
        } else {
            if ((keyEvent.getFlags() & 128) == 0) {
                z10 = false;
            }
            this.f818b0 = z10;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public boolean H(int i10) {
        int T0 = T0(i10);
        if (this.X && T0 == 108) {
            return false;
        }
        if (this.T && T0 == 1) {
            this.T = false;
        }
        if (T0 != 1) {
            if (T0 != 2) {
                if (T0 != 5) {
                    if (T0 != 10) {
                        if (T0 != 108) {
                            if (T0 != 109) {
                                return this.f841y.requestFeature(T0);
                            }
                            a1();
                            this.U = true;
                            return true;
                        }
                        a1();
                        this.T = true;
                        return true;
                    }
                    a1();
                    this.V = true;
                    return true;
                }
                a1();
                this.S = true;
                return true;
            }
            a1();
            this.R = true;
            return true;
        }
        a1();
        this.X = true;
        return true;
    }

    boolean I0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a s10 = s();
        if (s10 != null && s10.o(i10, keyEvent)) {
            return true;
        }
        u uVar = this.f817a0;
        if (uVar != null && Q0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            u uVar2 = this.f817a0;
            if (uVar2 != null) {
                uVar2.f880n = true;
            }
            return true;
        }
        if (this.f817a0 == null) {
            u v02 = v0(0, true);
            R0(v02, keyEvent);
            boolean Q0 = Q0(v02, keyEvent.getKeyCode(), keyEvent, 1);
            v02.f879m = false;
            if (Q0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public void J(int i10) {
        m0();
        ViewGroup viewGroup = (ViewGroup) this.O.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f840x).inflate(i10, viewGroup);
        this.f842z.c(this.f841y.getCallback());
    }

    boolean J0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                K0(0, keyEvent);
                return true;
            }
        } else if (F0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public void K(View view) {
        m0();
        ViewGroup viewGroup = (ViewGroup) this.O.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f842z.c(this.f841y.getCallback());
    }

    @Override // androidx.appcompat.app.g
    public void L(View view, ViewGroup.LayoutParams layoutParams) {
        m0();
        ViewGroup viewGroup = (ViewGroup) this.O.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f842z.c(this.f841y.getCallback());
    }

    void L0(int i10) {
        androidx.appcompat.app.a s10;
        if (i10 == 108 && (s10 = s()) != null) {
            s10.h(true);
        }
    }

    @Override // androidx.appcompat.app.g
    public void M(int i10) {
        if (this.f823g0 != i10) {
            this.f823g0 = i10;
            if (this.f819c0) {
                V();
            }
        }
    }

    void M0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a s10 = s();
            if (s10 != null) {
                s10.h(false);
            }
        } else if (i10 == 0) {
            u v02 = v0(i10, true);
            if (v02.f881o) {
                e0(v02, false);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void N(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.N(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f837u0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f838v0) != null) {
            n.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f838v0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f839w;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f837u0 = n.a((Activity) this.f839w);
                e1();
            }
        }
        this.f837u0 = onBackInvokedDispatcher;
        e1();
    }

    @Override // androidx.appcompat.app.g
    public void O(Toolbar toolbar) {
        if (!(this.f839w instanceof Activity)) {
            return;
        }
        androidx.appcompat.app.a s10 = s();
        if (!(s10 instanceof j0)) {
            this.C = null;
            if (s10 != null) {
                s10.n();
            }
            this.B = null;
            if (toolbar != null) {
                g0 g0Var = new g0(toolbar, w0(), this.f842z);
                this.B = g0Var;
                this.f842z.e(g0Var.f800c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f842z.e(null);
            }
            u();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // androidx.appcompat.app.g
    public void P(int i10) {
        this.f824h0 = i10;
    }

    final androidx.appcompat.app.a P0() {
        return this.B;
    }

    @Override // androidx.appcompat.app.g
    public final void Q(CharSequence charSequence) {
        this.D = charSequence;
        androidx.appcompat.widget.h0 h0Var = this.E;
        if (h0Var != null) {
            h0Var.setWindowTitle(charSequence);
        } else if (P0() != null) {
            P0().F(charSequence);
        } else {
            TextView textView = this.P;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public androidx.appcompat.view.b R(b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar != null) {
            androidx.appcompat.view.b bVar = this.H;
            if (bVar != null) {
                bVar.c();
            }
            i iVar = new i(aVar);
            androidx.appcompat.app.a s10 = s();
            if (s10 != null) {
                androidx.appcompat.view.b G = s10.G(iVar);
                this.H = G;
                if (G != null && (eVar = this.A) != null) {
                    eVar.onSupportActionModeStarted(G);
                }
            }
            if (this.H == null) {
                this.H = Z0(iVar);
            }
            e1();
            return this.H;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    void U0(Configuration configuration, androidx.core.os.j jVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            l.d(configuration, jVar);
            return;
        }
        j.d(configuration, jVar.d(0));
        j.c(configuration, jVar.d(0));
    }

    public boolean V() {
        return T(true);
    }

    void V0(androidx.core.os.j jVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            l.c(jVar);
        } else {
            Locale.setDefault(jVar.d(0));
        }
    }

    final boolean W0() {
        ViewGroup viewGroup;
        if (this.N && (viewGroup = this.O) != null && p0.Y(viewGroup)) {
            return true;
        }
        return false;
    }

    androidx.core.os.j Y(Context context) {
        androidx.core.os.j r10;
        androidx.core.os.j c10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (r10 = androidx.appcompat.app.g.r()) == null) {
            return null;
        }
        androidx.core.os.j u02 = u0(context.getApplicationContext().getResources().getConfiguration());
        if (i10 >= 24) {
            c10 = e0.b(r10, u02);
        } else if (r10.f()) {
            c10 = androidx.core.os.j.e();
        } else {
            c10 = androidx.core.os.j.c(r10.d(0).toString());
        }
        if (!c10.f()) {
            return c10;
        }
        return u02;
    }

    boolean Y0() {
        if (this.f837u0 == null) {
            return false;
        }
        u v02 = v0(0, false);
        if ((v02 == null || !v02.f881o) && this.H == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.appcompat.view.b Z0(androidx.appcompat.view.b.a r8) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.Z0(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        u o02;
        Window.Callback x02 = x0();
        if (x02 != null && !this.f821e0 && (o02 = o0(gVar.D())) != null) {
            return x02.onMenuItemSelected(o02.f867a, menuItem);
        }
        return false;
    }

    void a0(int i10, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i10 >= 0) {
                u[] uVarArr = this.Z;
                if (i10 < uVarArr.length) {
                    uVar = uVarArr[i10];
                }
            }
            if (uVar != null) {
                menu = uVar.f876j;
            }
        }
        if ((uVar == null || uVar.f881o) && !this.f821e0) {
            this.f842z.d(this.f841y.getCallback(), i10, menu);
        }
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        S0(true);
    }

    void b0(androidx.appcompat.view.menu.g gVar) {
        if (this.Y) {
            return;
        }
        this.Y = true;
        this.E.j();
        Window.Callback x02 = x0();
        if (x02 != null && !this.f821e0) {
            x02.onPanelClosed(108, gVar);
        }
        this.Y = false;
    }

    void d0(int i10) {
        e0(v0(i10, true), true);
    }

    @Override // androidx.appcompat.app.g
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        m0();
        ((ViewGroup) this.O.findViewById(16908290)).addView(view, layoutParams);
        this.f842z.c(this.f841y.getCallback());
    }

    void e0(u uVar, boolean z10) {
        ViewGroup viewGroup;
        androidx.appcompat.widget.h0 h0Var;
        if (z10 && uVar.f867a == 0 && (h0Var = this.E) != null && h0Var.c()) {
            b0(uVar.f876j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f840x.getSystemService("window");
        if (windowManager != null && uVar.f881o && (viewGroup = uVar.f873g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                a0(uVar.f867a, uVar, null);
            }
        }
        uVar.f879m = false;
        uVar.f880n = false;
        uVar.f881o = false;
        uVar.f874h = null;
        uVar.f883q = true;
        if (this.f817a0 == uVar) {
            this.f817a0 = null;
        }
        if (uVar.f867a == 0) {
            e1();
        }
    }

    void e1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean Y0 = Y0();
            if (Y0 && this.f838v0 == null) {
                this.f838v0 = n.b(this.f837u0, this);
            } else if (!Y0 && (onBackInvokedCallback = this.f838v0) != null) {
                n.c(this.f837u0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public Context g(Context context) {
        Configuration configuration;
        boolean z10 = true;
        this.f819c0 = true;
        int E0 = E0(context, Z());
        if (androidx.appcompat.app.g.v(context)) {
            androidx.appcompat.app.g.S(context);
        }
        androidx.core.os.j Y = Y(context);
        if (A0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, f0(context, E0, Y, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(f0(context, E0, Y, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f816z0) {
            return super.g(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = j.a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = p0(configuration3, configuration4);
        } else {
            configuration = null;
        }
        Configuration f02 = f0(context, E0, Y, configuration, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, g.i.f15830e);
        dVar.a(f02);
        boolean z11 = false;
        try {
            if (context.getTheme() == null) {
                z10 = false;
            }
            z11 = z10;
        } catch (NullPointerException unused3) {
        }
        if (z11) {
            h.f.a(dVar.getTheme());
        }
        return super.g(dVar);
    }

    final int g1(p1 p1Var, Rect rect) {
        int i10;
        boolean z10;
        int j10;
        int k10;
        boolean z11;
        int i11 = 0;
        if (p1Var != null) {
            i10 = p1Var.l();
        } else if (rect != null) {
            i10 = rect.top;
        } else {
            i10 = 0;
        }
        ActionBarContextView actionBarContextView = this.I;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.I.getLayoutParams();
            boolean z12 = true;
            if (this.I.isShown()) {
                if (this.f833q0 == null) {
                    this.f833q0 = new Rect();
                    this.f834r0 = new Rect();
                }
                Rect rect2 = this.f833q0;
                Rect rect3 = this.f834r0;
                if (p1Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(p1Var.j(), p1Var.l(), p1Var.k(), p1Var.i());
                }
                r1.a(this.O, rect2, rect3);
                int i12 = rect2.top;
                int i13 = rect2.left;
                int i14 = rect2.right;
                p1 L = p0.L(this.O);
                if (L == null) {
                    j10 = 0;
                } else {
                    j10 = L.j();
                }
                if (L == null) {
                    k10 = 0;
                } else {
                    k10 = L.k();
                }
                if (marginLayoutParams.topMargin == i12 && marginLayoutParams.leftMargin == i13 && marginLayoutParams.rightMargin == i14) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i12;
                    marginLayoutParams.leftMargin = i13;
                    marginLayoutParams.rightMargin = i14;
                    z11 = true;
                }
                if (i12 > 0 && this.Q == null) {
                    View view = new View(this.f840x);
                    this.Q = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = j10;
                    layoutParams.rightMargin = k10;
                    this.O.addView(this.Q, -1, layoutParams);
                } else {
                    View view2 = this.Q;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i15 = marginLayoutParams2.height;
                        int i16 = marginLayoutParams.topMargin;
                        if (i15 != i16 || marginLayoutParams2.leftMargin != j10 || marginLayoutParams2.rightMargin != k10) {
                            marginLayoutParams2.height = i16;
                            marginLayoutParams2.leftMargin = j10;
                            marginLayoutParams2.rightMargin = k10;
                            this.Q.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.Q;
                if (view3 == null) {
                    z12 = false;
                }
                if (z12 && view3.getVisibility() != 0) {
                    h1(this.Q);
                }
                if (!this.V && z12) {
                    i10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.I.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view4 = this.Q;
        if (view4 != null) {
            if (!z10) {
                i11 = 8;
            }
            view4.setVisibility(i11);
        }
        return i10;
    }

    public View h0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        boolean z11 = false;
        if (this.f835s0 == null) {
            String string = this.f840x.obtainStyledAttributes(g.j.f15955y0).getString(g.j.C0);
            if (string == null) {
                this.f835s0 = new z();
            } else {
                try {
                    this.f835s0 = (z) this.f840x.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f835s0 = new z();
                }
            }
        }
        boolean z12 = f814x0;
        if (z12) {
            if (this.f836t0 == null) {
                this.f836t0 = new d0();
            }
            if (this.f836t0.a(attributeSet)) {
                z10 = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                        z11 = true;
                    }
                } else {
                    z11 = X0((ViewParent) view);
                }
                z10 = z11;
            }
        } else {
            z10 = false;
        }
        return this.f835s0.r(view, str, context, attributeSet, z10, z12, true, q1.d());
    }

    void i0() {
        androidx.appcompat.view.menu.g gVar;
        androidx.appcompat.widget.h0 h0Var = this.E;
        if (h0Var != null) {
            h0Var.j();
        }
        if (this.J != null) {
            this.f841y.getDecorView().removeCallbacks(this.K);
            if (this.J.isShowing()) {
                try {
                    this.J.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.J = null;
        }
        l0();
        u v02 = v0(0, false);
        if (v02 != null && (gVar = v02.f876j) != null) {
            gVar.close();
        }
    }

    @Override // androidx.appcompat.app.g
    public <T extends View> T j(int i10) {
        m0();
        return (T) this.f841y.findViewById(i10);
    }

    boolean j0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f839w;
        boolean z10 = true;
        if (((obj instanceof q.a) || (obj instanceof x)) && (decorView = this.f841y.getDecorView()) != null && androidx.core.view.q.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f842z.b(this.f841y.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z10 = false;
        }
        if (z10) {
            return G0(keyCode, keyEvent);
        }
        return J0(keyCode, keyEvent);
    }

    void k0(int i10) {
        u v02;
        u v03 = v0(i10, true);
        if (v03.f876j != null) {
            Bundle bundle = new Bundle();
            v03.f876j.Q(bundle);
            if (bundle.size() > 0) {
                v03.f885s = bundle;
            }
            v03.f876j.d0();
            v03.f876j.clear();
        }
        v03.f884r = true;
        v03.f883q = true;
        if ((i10 == 108 || i10 == 0) && this.E != null && (v02 = v0(0, false)) != null) {
            v02.f879m = false;
            R0(v02, null);
        }
    }

    @Override // androidx.appcompat.app.g
    public Context l() {
        return this.f840x;
    }

    void l0() {
        x0 x0Var = this.L;
        if (x0Var != null) {
            x0Var.c();
        }
    }

    @Override // androidx.appcompat.app.g
    public final b.InterfaceC0011b n() {
        return new f();
    }

    @Override // androidx.appcompat.app.g
    public int o() {
        return this.f823g0;
    }

    u o0(Menu menu) {
        int i10;
        u[] uVarArr = this.Z;
        if (uVarArr != null) {
            i10 = uVarArr.length;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            u uVar = uVarArr[i11];
            if (uVar != null && uVar.f876j == menu) {
                return uVar;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return h0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.g
    public MenuInflater q() {
        Context context;
        if (this.C == null) {
            y0();
            androidx.appcompat.app.a aVar = this.B;
            if (aVar != null) {
                context = aVar.j();
            } else {
                context = this.f840x;
            }
            this.C = new androidx.appcompat.view.g(context);
        }
        return this.C;
    }

    final Context q0() {
        Context context;
        androidx.appcompat.app.a s10 = s();
        if (s10 != null) {
            context = s10.j();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f840x;
        }
        return context;
    }

    @Override // androidx.appcompat.app.g
    public androidx.appcompat.app.a s() {
        y0();
        return this.B;
    }

    @Override // androidx.appcompat.app.g
    public void t() {
        LayoutInflater from = LayoutInflater.from(this.f840x);
        if (from.getFactory() == null) {
            androidx.core.view.r.a(from, this);
        } else if (!(from.getFactory2() instanceof h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.g
    public void u() {
        if (P0() != null && !s().l()) {
            C0(0);
        }
    }

    androidx.core.os.j u0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return l.b(configuration);
        }
        return androidx.core.os.j.c(k.b(configuration.locale));
    }

    protected u v0(int i10, boolean z10) {
        u[] uVarArr = this.Z;
        if (uVarArr == null || uVarArr.length <= i10) {
            u[] uVarArr2 = new u[i10 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.Z = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i10];
        if (uVar == null) {
            u uVar2 = new u(i10);
            uVarArr[i10] = uVar2;
            return uVar2;
        }
        return uVar;
    }

    final CharSequence w0() {
        Object obj = this.f839w;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.D;
    }

    @Override // androidx.appcompat.app.g
    public void x(Configuration configuration) {
        androidx.appcompat.app.a s10;
        if (this.T && this.N && (s10 = s()) != null) {
            s10.m(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f840x);
        this.f822f0 = new Configuration(this.f840x.getResources().getConfiguration());
        U(false, false);
    }

    final Window.Callback x0() {
        return this.f841y.getCallback();
    }

    @Override // androidx.appcompat.app.g
    public void y(Bundle bundle) {
        String str;
        this.f819c0 = true;
        T(false);
        n0();
        Object obj = this.f839w;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.k.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                androidx.appcompat.app.a P0 = P0();
                if (P0 == null) {
                    this.f832p0 = true;
                } else {
                    P0.s(true);
                }
            }
            androidx.appcompat.app.g.d(this);
        }
        this.f822f0 = new Configuration(this.f840x.getResources().getConfiguration());
        this.f820d0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // androidx.appcompat.app.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f839w
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.g.F(r3)
        L9:
            boolean r0 = r3.f829m0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f841y
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f831o0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f821e0 = r0
            int r0 = r3.f823g0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f839w
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.h.f813w0
            java.lang.Object r1 = r3.f839w
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f823g0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.h.f813w0
            java.lang.Object r1 = r3.f839w
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.B
            if (r0 == 0) goto L5b
            r0.n()
        L5b:
            r3.c0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.z():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private h(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        androidx.collection.g<String, Integer> gVar;
        Integer num;
        androidx.appcompat.app.d b12;
        this.L = null;
        this.M = true;
        this.f823g0 = -100;
        this.f831o0 = new a();
        this.f840x = context;
        this.A = eVar;
        this.f839w = obj;
        if (this.f823g0 == -100 && (obj instanceof Dialog) && (b12 = b1()) != null) {
            this.f823g0 = b12.getDelegate().o();
        }
        if (this.f823g0 == -100 && (num = (gVar = f813w0).get(obj.getClass().getName())) != null) {
            this.f823g0 = num.intValue();
            gVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            X(window);
        }
        androidx.appcompat.widget.j.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class o extends androidx.appcompat.view.i {

        /* renamed from: m  reason: collision with root package name */
        private g f854m;

        /* renamed from: p  reason: collision with root package name */
        private boolean f855p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f856q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f857r;

        o(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f856q = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f856q = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f855p = true;
                callback.onContentChanged();
            } finally {
                this.f855p = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f857r = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f857r = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f856q) {
                return a().dispatchKeyEvent(keyEvent);
            }
            if (!h.this.j0(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent) && !h.this.I0(keyEvent.getKeyCode(), keyEvent)) {
                return false;
            }
            return true;
        }

        void e(g gVar) {
            this.f854m = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.f840x, callback);
            androidx.appcompat.view.b R = h.this.R(aVar);
            if (R != null) {
                return aVar.e(R);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f855p) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 == 0 && !(menu instanceof androidx.appcompat.view.menu.g)) {
                return false;
            }
            return super.onCreatePanelMenu(i10, menu);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View onCreatePanelView;
            g gVar = this.f854m;
            if (gVar != null && (onCreatePanelView = gVar.onCreatePanelView(i10)) != null) {
                return onCreatePanelView;
            }
            return super.onCreatePanelView(i10);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            h.this.L0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f857r) {
                a().onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            h.this.M0(i10);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar;
            if (menu instanceof androidx.appcompat.view.menu.g) {
                gVar = (androidx.appcompat.view.menu.g) menu;
            } else {
                gVar = null;
            }
            if (i10 == 0 && gVar == null) {
                return false;
            }
            boolean z10 = true;
            if (gVar != null) {
                gVar.a0(true);
            }
            g gVar2 = this.f854m;
            if (gVar2 == null || !gVar2.a(i10)) {
                z10 = false;
            }
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (gVar != null) {
                gVar.a0(false);
            }
            return z10;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.g gVar;
            u v02 = h.this.v0(0, true);
            if (v02 != null && (gVar = v02.f876j) != null) {
                super.onProvideKeyboardShortcuts(list, gVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (h.this.D0()) {
                return f(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            if (h.this.D0() && i10 == 0) {
                return f(callback);
            }
            return super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            h.this.i0();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }
    }

    @Override // androidx.appcompat.app.g
    public void C(Bundle bundle) {
    }

    void N0(ViewGroup viewGroup) {
    }
}
