package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.n0;
import androidx.core.view.y;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater.java */
/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f967e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f968f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f969a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f970b;

    /* renamed from: c  reason: collision with root package name */
    Context f971c;

    /* renamed from: d  reason: collision with root package name */
    private Object f972d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: p  reason: collision with root package name */
        private static final Class<?>[] f973p = {MenuItem.class};

        /* renamed from: f  reason: collision with root package name */
        private Object f974f;

        /* renamed from: m  reason: collision with root package name */
        private Method f975m;

        public a(Object obj, String str) {
            this.f974f = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f975m = cls.getMethod(str, f973p);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f975m.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f975m.invoke(this.f974f, menuItem)).booleanValue();
                }
                this.f975m.invoke(this.f974f, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f976a;

        /* renamed from: b  reason: collision with root package name */
        private int f977b;

        /* renamed from: c  reason: collision with root package name */
        private int f978c;

        /* renamed from: d  reason: collision with root package name */
        private int f979d;

        /* renamed from: e  reason: collision with root package name */
        private int f980e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f981f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f982g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f983h;

        /* renamed from: i  reason: collision with root package name */
        private int f984i;

        /* renamed from: j  reason: collision with root package name */
        private int f985j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f986k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f987l;

        /* renamed from: m  reason: collision with root package name */
        private int f988m;

        /* renamed from: n  reason: collision with root package name */
        private char f989n;

        /* renamed from: o  reason: collision with root package name */
        private int f990o;

        /* renamed from: p  reason: collision with root package name */
        private char f991p;

        /* renamed from: q  reason: collision with root package name */
        private int f992q;

        /* renamed from: r  reason: collision with root package name */
        private int f993r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f994s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f995t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f996u;

        /* renamed from: v  reason: collision with root package name */
        private int f997v;

        /* renamed from: w  reason: collision with root package name */
        private int f998w;

        /* renamed from: x  reason: collision with root package name */
        private String f999x;

        /* renamed from: y  reason: collision with root package name */
        private String f1000y;

        /* renamed from: z  reason: collision with root package name */
        private String f1001z;

        public b(Menu menu) {
            this.f976a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f971c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10;
            MenuItem enabled = menuItem.setChecked(this.f994s).setVisible(this.f995t).setEnabled(this.f996u);
            boolean z11 = false;
            if (this.f993r >= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            enabled.setCheckable(z10).setTitleCondensed(this.f987l).setIcon(this.f988m);
            int i10 = this.f997v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f1001z != null) {
                if (!g.this.f971c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f1001z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f993r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.i) {
                    ((androidx.appcompat.view.menu.i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.f999x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f967e, g.this.f969a));
                z11 = true;
            }
            int i11 = this.f998w;
            if (i11 > 0) {
                if (!z11) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                y.b(menuItem, bVar);
            }
            y.d(menuItem, this.B);
            y.h(menuItem, this.C);
            y.c(menuItem, this.f989n, this.f990o);
            y.g(menuItem, this.f991p, this.f992q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                y.f(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                y.e(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f983h = true;
            i(this.f976a.add(this.f977b, this.f984i, this.f985j, this.f986k));
        }

        public SubMenu b() {
            this.f983h = true;
            SubMenu addSubMenu = this.f976a.addSubMenu(this.f977b, this.f984i, this.f985j, this.f986k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f983h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f971c.obtainStyledAttributes(attributeSet, g.j.f15946w1);
            this.f977b = obtainStyledAttributes.getResourceId(g.j.f15956y1, 0);
            this.f978c = obtainStyledAttributes.getInt(g.j.A1, 0);
            this.f979d = obtainStyledAttributes.getInt(g.j.B1, 0);
            this.f980e = obtainStyledAttributes.getInt(g.j.C1, 0);
            this.f981f = obtainStyledAttributes.getBoolean(g.j.f15961z1, true);
            this.f982g = obtainStyledAttributes.getBoolean(g.j.f15951x1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            boolean z10;
            g1 u10 = g1.u(g.this.f971c, attributeSet, g.j.D1);
            this.f984i = u10.n(g.j.G1, 0);
            this.f985j = (u10.k(g.j.J1, this.f978c) & (-65536)) | (u10.k(g.j.K1, this.f979d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.f986k = u10.p(g.j.L1);
            this.f987l = u10.p(g.j.M1);
            this.f988m = u10.n(g.j.E1, 0);
            this.f989n = c(u10.o(g.j.N1));
            this.f990o = u10.k(g.j.U1, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            this.f991p = c(u10.o(g.j.O1));
            this.f992q = u10.k(g.j.Y1, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            int i10 = g.j.P1;
            if (u10.s(i10)) {
                this.f993r = u10.a(i10, false) ? 1 : 0;
            } else {
                this.f993r = this.f980e;
            }
            this.f994s = u10.a(g.j.H1, false);
            this.f995t = u10.a(g.j.I1, this.f981f);
            this.f996u = u10.a(g.j.F1, this.f982g);
            this.f997v = u10.k(g.j.Z1, -1);
            this.f1001z = u10.o(g.j.Q1);
            this.f998w = u10.n(g.j.R1, 0);
            this.f999x = u10.o(g.j.T1);
            String o10 = u10.o(g.j.S1);
            this.f1000y = o10;
            if (o10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.f998w == 0 && this.f999x == null) {
                this.A = (androidx.core.view.b) e(o10, g.f968f, g.this.f970b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = u10.p(g.j.V1);
            this.C = u10.p(g.j.f15835a2);
            int i11 = g.j.X1;
            if (u10.s(i11)) {
                this.E = n0.e(u10.k(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = g.j.W1;
            if (u10.s(i12)) {
                this.D = u10.c(i12);
            } else {
                this.D = null;
            }
            u10.w();
            this.f983h = false;
        }

        public void h() {
            this.f977b = 0;
            this.f978c = 0;
            this.f979d = 0;
            this.f980e = 0;
            this.f981f = true;
            this.f982g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f967e = clsArr;
        f968f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f971c = context;
        Object[] objArr = {context};
        this.f969a = objArr;
        this.f970b = objArr;
    }

    private Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r0.d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        if (r15.a() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            androidx.appcompat.view.g$b r0 = new androidx.appcompat.view.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r5
            r6 = 0
            r7 = 0
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r5
            r7 = 0
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.a()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = 1
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = 1
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object b() {
        if (this.f972d == null) {
            this.f972d = a(this.f971c);
        }
        return this.f972d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof s2.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f971c.getResources().getLayout(i10);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
