package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.s0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j$.time.Duration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: classes.dex */
public class n0 {

    /* renamed from: d  reason: collision with root package name */
    private static int f4073d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f4074a;

    /* renamed from: b  reason: collision with root package name */
    public int f4075b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f4076c = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;

        /* renamed from: e  reason: collision with root package name */
        public static final a f4077e = new a(1, null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f4078f = new a(2, null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f4079g = new a(4, null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f4080h = new a(8, null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f4081i = new a(16, null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f4082j = new a(32, null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f4083k = new a(64, null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f4084l = new a(128, null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f4085m = new a((int) UserVerificationMethods.USER_VERIFY_HANDPRINT, (CharSequence) null, s0.b.class);

        /* renamed from: n  reason: collision with root package name */
        public static final a f4086n = new a(512, (CharSequence) null, s0.b.class);

        /* renamed from: o  reason: collision with root package name */
        public static final a f4087o = new a((int) UserVerificationMethods.USER_VERIFY_ALL, (CharSequence) null, s0.c.class);

        /* renamed from: p  reason: collision with root package name */
        public static final a f4088p = new a((int) RecyclerView.m.FLAG_MOVED, (CharSequence) null, s0.c.class);

        /* renamed from: q  reason: collision with root package name */
        public static final a f4089q = new a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, null);

        /* renamed from: r  reason: collision with root package name */
        public static final a f4090r = new a(8192, null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f4091s = new a(Http2.INITIAL_MAX_FRAME_SIZE, null);

        /* renamed from: t  reason: collision with root package name */
        public static final a f4092t = new a(32768, null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f4093u = new a(65536, null);

        /* renamed from: v  reason: collision with root package name */
        public static final a f4094v = new a(131072, (CharSequence) null, s0.g.class);

        /* renamed from: w  reason: collision with root package name */
        public static final a f4095w = new a(262144, null);

        /* renamed from: x  reason: collision with root package name */
        public static final a f4096x = new a(524288, null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f4097y = new a(1048576, null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f4098z = new a(2097152, (CharSequence) null, s0.h.class);

        /* renamed from: a  reason: collision with root package name */
        final Object f4099a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4100b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<? extends s0.a> f4101c;

        /* renamed from: d  reason: collision with root package name */
        protected final s0 f4102d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction29;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction30;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction31;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction32;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction33;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction34;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction35;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction36;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction37;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction38;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction39;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction40;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction41;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction42;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction43 = null;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                accessibilityAction42 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
                accessibilityAction = accessibilityAction42;
            } else {
                accessibilityAction = null;
            }
            A = new a(accessibilityAction, 16908342, null, null, null);
            if (i10 >= 23) {
                accessibilityAction41 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
                accessibilityAction2 = accessibilityAction41;
            } else {
                accessibilityAction2 = null;
            }
            B = new a(accessibilityAction2, 16908343, null, null, s0.e.class);
            if (i10 >= 23) {
                accessibilityAction40 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
                accessibilityAction3 = accessibilityAction40;
            } else {
                accessibilityAction3 = null;
            }
            C = new a(accessibilityAction3, 16908344, null, null, null);
            if (i10 >= 23) {
                accessibilityAction39 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
                accessibilityAction4 = accessibilityAction39;
            } else {
                accessibilityAction4 = null;
            }
            D = new a(accessibilityAction4, 16908345, null, null, null);
            if (i10 >= 23) {
                accessibilityAction38 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
                accessibilityAction5 = accessibilityAction38;
            } else {
                accessibilityAction5 = null;
            }
            E = new a(accessibilityAction5, 16908346, null, null, null);
            if (i10 >= 23) {
                accessibilityAction37 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
                accessibilityAction6 = accessibilityAction37;
            } else {
                accessibilityAction6 = null;
            }
            F = new a(accessibilityAction6, 16908347, null, null, null);
            if (i10 >= 29) {
                accessibilityAction36 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction7 = accessibilityAction36;
            } else {
                accessibilityAction7 = null;
            }
            G = new a(accessibilityAction7, 16908358, null, null, null);
            if (i10 >= 29) {
                accessibilityAction35 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction8 = accessibilityAction35;
            } else {
                accessibilityAction8 = null;
            }
            H = new a(accessibilityAction8, 16908359, null, null, null);
            if (i10 >= 29) {
                accessibilityAction34 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction9 = accessibilityAction34;
            } else {
                accessibilityAction9 = null;
            }
            I = new a(accessibilityAction9, 16908360, null, null, null);
            if (i10 >= 29) {
                accessibilityAction33 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction10 = accessibilityAction33;
            } else {
                accessibilityAction10 = null;
            }
            J = new a(accessibilityAction10, 16908361, null, null, null);
            if (i10 >= 23) {
                accessibilityAction32 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
                accessibilityAction11 = accessibilityAction32;
            } else {
                accessibilityAction11 = null;
            }
            K = new a(accessibilityAction11, 16908348, null, null, null);
            if (i10 >= 24) {
                accessibilityAction31 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction12 = accessibilityAction31;
            } else {
                accessibilityAction12 = null;
            }
            L = new a(accessibilityAction12, 16908349, null, null, s0.f.class);
            if (i10 >= 26) {
                accessibilityAction30 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction13 = accessibilityAction30;
            } else {
                accessibilityAction13 = null;
            }
            M = new a(accessibilityAction13, 16908354, null, null, s0.d.class);
            if (i10 >= 28) {
                accessibilityAction29 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction14 = accessibilityAction29;
            } else {
                accessibilityAction14 = null;
            }
            N = new a(accessibilityAction14, 16908356, null, null, null);
            if (i10 >= 28) {
                accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction15 = accessibilityAction28;
            } else {
                accessibilityAction15 = null;
            }
            O = new a(accessibilityAction15, 16908357, null, null, null);
            if (i10 >= 30) {
                accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction16 = accessibilityAction27;
            } else {
                accessibilityAction16 = null;
            }
            P = new a(accessibilityAction16, 16908362, null, null, null);
            if (i10 >= 30) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction17 = accessibilityAction26;
            } else {
                accessibilityAction17 = null;
            }
            Q = new a(accessibilityAction17, 16908372, null, null, null);
            if (i10 >= 32) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction18 = accessibilityAction25;
            } else {
                accessibilityAction18 = null;
            }
            R = new a(accessibilityAction18, 16908373, null, null, null);
            if (i10 >= 32) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction19 = accessibilityAction24;
            } else {
                accessibilityAction19 = null;
            }
            S = new a(accessibilityAction19, 16908374, null, null, null);
            if (i10 >= 32) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction20 = accessibilityAction23;
            } else {
                accessibilityAction20 = null;
            }
            T = new a(accessibilityAction20, 16908375, null, null, null);
            if (i10 >= 33) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction21 = accessibilityAction22;
            } else {
                accessibilityAction21 = null;
            }
            U = new a(accessibilityAction21, 16908376, null, null, null);
            if (i10 >= 34) {
                accessibilityAction43 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
            }
            V = new a(accessibilityAction43, 16908382, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, s0 s0Var) {
            return new a(null, this.f4100b, charSequence, s0Var, this.f4101c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f4099a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f4099a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            String name;
            s0.a newInstance;
            if (this.f4102d == null) {
                return false;
            }
            Class<? extends s0.a> cls = this.f4101c;
            s0.a aVar = null;
            if (cls != null) {
                try {
                    newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    newInstance.a(bundle);
                    aVar = newInstance;
                } catch (Exception e11) {
                    e = e11;
                    aVar = newInstance;
                    Class<? extends s0.a> cls2 = this.f4101c;
                    if (cls2 == null) {
                        name = "null";
                    } else {
                        name = cls2.getName();
                    }
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                    return this.f4102d.a(view, aVar);
                }
            }
            return this.f4102d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f4099a;
            if (obj2 == null) {
                if (aVar.f4099a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f4099a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f4099a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String j10 = n0.j(this.f4100b);
            if (j10.equals("ACTION_UNKNOWN") && c() != null) {
                j10 = c().toString();
            }
            sb2.append(j10);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, s0 s0Var) {
            this(null, i10, charSequence, s0Var, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends s0.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, s0 s0Var, Class<? extends s0.a> cls) {
            this.f4100b = i10;
            this.f4102d = s0Var;
            if (obj == null) {
                this.f4099a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f4099a = obj;
            }
            this.f4101c = cls;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static g a(int i10, int i11, int i12, int i13, boolean z10) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static Object b(int i10, float f10, float f11, float f12) {
            return AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12);
        }

        public static Bundle c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static Object a(int i10, float f10, float f11, float f12) {
            return new AccessibilityNodeInfo.RangeInfo(i10, f10, f11, f12);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static g a(boolean z10, int i10, int i11, int i12, int i13, boolean z11, String str, String str2) {
            return new g(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z10).setColumnIndex(i10).setRowIndex(i11).setColumnSpan(i12).setRowSpan(i13).setSelected(z11).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static n0 b(AccessibilityNodeInfo accessibilityNodeInfo, int i10, int i11) {
            return n0.f1(accessibilityNodeInfo.getChild(i10, i11));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static n0 f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
            return n0.f1(accessibilityNodeInfo.getParent(i10));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setTextSelectable(z10);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public static void a(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return o0.a(accessibilityNodeInfo).toMillis();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void f(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, long j10) {
            p0.a(accessibilityNodeInfo, Duration.ofMillis(j10));
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z10) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z10);
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z10);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        final Object f4103a;

        f(Object obj) {
            this.f4103a = obj;
        }

        public static f a(int i10, int i11, boolean z10, int i12) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        final Object f4104a;

        g(Object obj) {
            this.f4104a = obj;
        }

        public static g a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        final Object f4105a;

        h(Object obj) {
            this.f4105a = obj;
        }

        public static h a(int i10, float f10, float f11, float f12) {
            return new h(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }
    }

    @Deprecated
    public n0(Object obj) {
        this.f4074a = (AccessibilityNodeInfo) obj;
    }

    private SparseArray<WeakReference<ClickableSpan>> A(View view) {
        return (SparseArray) view.getTag(r2.e.I);
    }

    private boolean G() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int H(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f4073d;
        f4073d = i11 + 1;
        return i11;
    }

    public static n0 a0() {
        return e1(AccessibilityNodeInfo.obtain());
    }

    public static n0 b0(View view) {
        return e1(AccessibilityNodeInfo.obtain(view));
    }

    public static n0 c0(n0 n0Var) {
        return e1(AccessibilityNodeInfo.obtain(n0Var.f4074a));
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    public static n0 e1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new n0(accessibilityNodeInfo);
    }

    static n0 f1(Object obj) {
        if (obj != null) {
            return new n0(obj);
        }
        return null;
    }

    private void g() {
        b.c(this.f4074a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        b.c(this.f4074a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        b.c(this.f4074a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        b.c(this.f4074a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private void g0(View view) {
        SparseArray<WeakReference<ClickableSpan>> A = A(view);
        if (A != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < A.size(); i10++) {
                if (A.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                A.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private List<Integer> h(String str) {
        ArrayList<Integer> integerArrayList = b.c(this.f4074a).getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            b.c(this.f4074a).putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    private void i0(int i10, boolean z10) {
        Bundle v10 = v();
        if (v10 != null) {
            int i11 = v10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            v10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    static String j(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                switch (i10) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case UserVerificationMethods.USER_VERIFY_HANDPRINT /* 256 */:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case UserVerificationMethods.USER_VERIFY_ALL /* 1024 */:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case RecyclerView.m.FLAG_MOVED /* 2048 */:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908382:
                        return "ACTION_SCROLL_IN_DIRECTION";
                    default:
                        switch (i10) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i10) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i10) {
                                            case 16908372:
                                                return "ACTION_IME_ENTER";
                                            case 16908373:
                                                return "ACTION_DRAG_START";
                                            case 16908374:
                                                return "ACTION_DRAG_DROP";
                                            case 16908375:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    private boolean l(int i10) {
        Bundle v10 = v();
        if (v10 == null || (v10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) != i10) {
            return false;
        }
        return true;
    }

    public static ClickableSpan[] r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> y(View view) {
        SparseArray<WeakReference<ClickableSpan>> A = A(view);
        if (A == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(r2.e.I, sparseArray);
            return sparseArray;
        }
        return A;
    }

    public void A0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4074a.setHintText(charSequence);
        } else {
            b.c(this.f4074a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public CharSequence B() {
        if (Build.VERSION.SDK_INT >= 30) {
            return c.b(this.f4074a);
        }
        return b.c(this.f4074a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void B0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f4074a.setImportantForAccessibility(z10);
        }
    }

    public CharSequence C() {
        if (G()) {
            List<Integer> h10 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> h11 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> h12 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> h13 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f4074a.getText(), 0, this.f4074a.getText().length()));
            for (int i10 = 0; i10 < h10.size(); i10++) {
                spannableString.setSpan(new androidx.core.view.accessibility.a(h13.get(i10).intValue(), this, v().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h10.get(i10).intValue(), h11.get(i10).intValue(), h12.get(i10).intValue());
            }
            return spannableString;
        }
        return this.f4074a.getText();
    }

    public void C0(View view) {
        this.f4074a.setLabelFor(view);
    }

    public CharSequence D() {
        CharSequence tooltipText;
        if (Build.VERSION.SDK_INT >= 28) {
            tooltipText = this.f4074a.getTooltipText();
            return tooltipText;
        }
        return b.c(this.f4074a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void D0(int i10) {
        this.f4074a.setLiveRegion(i10);
    }

    public String E() {
        if (Build.VERSION.SDK_INT >= 33) {
            return d.g(this.f4074a);
        }
        return b.c(this.f4074a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void E0(boolean z10) {
        this.f4074a.setLongClickable(z10);
    }

    public String F() {
        return this.f4074a.getViewIdResourceName();
    }

    public void F0(int i10) {
        this.f4074a.setMaxTextLength(i10);
    }

    public void G0(int i10) {
        this.f4074a.setMovementGranularities(i10);
    }

    public void H0(CharSequence charSequence) {
        this.f4074a.setPackageName(charSequence);
    }

    public boolean I() {
        if (Build.VERSION.SDK_INT >= 34) {
            return e.e(this.f4074a);
        }
        return l(64);
    }

    public void I0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4074a.setPaneTitle(charSequence);
        } else {
            b.c(this.f4074a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public boolean J() {
        return this.f4074a.isAccessibilityFocused();
    }

    public void J0(View view) {
        this.f4075b = -1;
        this.f4074a.setParent(view);
    }

    public boolean K() {
        return this.f4074a.isCheckable();
    }

    public void K0(View view, int i10) {
        this.f4075b = i10;
        this.f4074a.setParent(view, i10);
    }

    public boolean L() {
        return this.f4074a.isChecked();
    }

    public void L0(boolean z10) {
        this.f4074a.setPassword(z10);
    }

    public boolean M() {
        return this.f4074a.isClickable();
    }

    public void M0(h hVar) {
        this.f4074a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) hVar.f4105a);
    }

    public boolean N() {
        boolean isContextClickable;
        if (Build.VERSION.SDK_INT >= 23) {
            isContextClickable = this.f4074a.isContextClickable();
            return isContextClickable;
        }
        return false;
    }

    public void N0(CharSequence charSequence) {
        b.c(this.f4074a).putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean O() {
        return this.f4074a.isEnabled();
    }

    public void O0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4074a.setScreenReaderFocusable(z10);
        } else {
            i0(1, z10);
        }
    }

    public boolean P() {
        return this.f4074a.isFocusable();
    }

    public void P0(boolean z10) {
        this.f4074a.setScrollable(z10);
    }

    public boolean Q() {
        return this.f4074a.isFocused();
    }

    public void Q0(boolean z10) {
        this.f4074a.setSelected(z10);
    }

    public boolean R() {
        return l(67108864);
    }

    public void R0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4074a.setShowingHintText(z10);
        } else {
            i0(4, z10);
        }
    }

    public boolean S() {
        boolean isImportantForAccessibility;
        if (Build.VERSION.SDK_INT >= 24) {
            isImportantForAccessibility = this.f4074a.isImportantForAccessibility();
            return isImportantForAccessibility;
        }
        return true;
    }

    public void S0(View view) {
        this.f4076c = -1;
        this.f4074a.setSource(view);
    }

    public boolean T() {
        return this.f4074a.isLongClickable();
    }

    public void T0(View view, int i10) {
        this.f4076c = i10;
        this.f4074a.setSource(view, i10);
    }

    public boolean U() {
        return this.f4074a.isPassword();
    }

    public void U0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.c(this.f4074a, charSequence);
        } else {
            b.c(this.f4074a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean V() {
        return this.f4074a.isScrollable();
    }

    public void V0(CharSequence charSequence) {
        this.f4074a.setText(charSequence);
    }

    public boolean W() {
        return this.f4074a.isSelected();
    }

    public void W0(int i10, int i11) {
        this.f4074a.setTextSelection(i10, i11);
    }

    public boolean X() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT >= 26) {
            isShowingHintText = this.f4074a.isShowingHintText();
            return isShowingHintText;
        }
        return l(4);
    }

    public void X0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f4074a.setTraversalAfter(view);
        }
    }

    public boolean Y() {
        if (Build.VERSION.SDK_INT >= 33) {
            return d.h(this.f4074a);
        }
        return l(8388608);
    }

    public void Y0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f4074a.setTraversalAfter(view, i10);
        }
    }

    public boolean Z() {
        return this.f4074a.isVisibleToUser();
    }

    public void Z0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f4074a.setTraversalBefore(view);
        }
    }

    public void a(int i10) {
        this.f4074a.addAction(i10);
    }

    public void a1(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f4074a.setTraversalBefore(view, i10);
        }
    }

    public void b(a aVar) {
        this.f4074a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f4099a);
    }

    public void b1(String str) {
        this.f4074a.setViewIdResourceName(str);
    }

    public void c(View view) {
        this.f4074a.addChild(view);
    }

    public void c1(boolean z10) {
        this.f4074a.setVisibleToUser(z10);
    }

    public void d(View view, int i10) {
        this.f4074a.addChild(view, i10);
    }

    public boolean d0(int i10, Bundle bundle) {
        return this.f4074a.performAction(i10, bundle);
    }

    public AccessibilityNodeInfo d1() {
        return this.f4074a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4074a;
        if (accessibilityNodeInfo == null) {
            if (n0Var.f4074a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(n0Var.f4074a)) {
            return false;
        }
        if (this.f4076c == n0Var.f4076c && this.f4075b == n0Var.f4075b) {
            return true;
        }
        return false;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            g0(view);
            ClickableSpan[] r10 = r(charSequence);
            if (r10 != null && r10.length > 0) {
                v().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", r2.e.f22080a);
                SparseArray<WeakReference<ClickableSpan>> y10 = y(view);
                for (int i10 = 0; i10 < r10.length; i10++) {
                    int H = H(r10[i10], y10);
                    y10.put(H, new WeakReference<>(r10[i10]));
                    e(r10[i10], (Spanned) charSequence, H);
                }
            }
        }
    }

    public boolean f0(a aVar) {
        return this.f4074a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f4099a);
    }

    public void h0(boolean z10) {
        this.f4074a.setAccessibilityFocused(z10);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4074a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List<a> i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f4074a.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new a(actionList.get(i10)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Deprecated
    public void j0(Rect rect) {
        this.f4074a.setBoundsInParent(rect);
    }

    @Deprecated
    public int k() {
        return this.f4074a.getActions();
    }

    public void k0(Rect rect) {
        this.f4074a.setBoundsInScreen(rect);
    }

    public void l0(boolean z10) {
        this.f4074a.setCheckable(z10);
    }

    @Deprecated
    public void m(Rect rect) {
        this.f4074a.getBoundsInParent(rect);
    }

    public void m0(boolean z10) {
        this.f4074a.setChecked(z10);
    }

    public void n(Rect rect) {
        this.f4074a.getBoundsInScreen(rect);
    }

    public void n0(CharSequence charSequence) {
        this.f4074a.setClassName(charSequence);
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.a(this.f4074a, rect);
            return;
        }
        Rect rect2 = (Rect) b.c(this.f4074a).getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void o0(boolean z10) {
        this.f4074a.setClickable(z10);
    }

    public int p() {
        return this.f4074a.getChildCount();
    }

    public void p0(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4074a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f4103a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public CharSequence q() {
        return this.f4074a.getClassName();
    }

    public void q0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4074a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f4104a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    public void r0(CharSequence charSequence) {
        this.f4074a.setContentDescription(charSequence);
    }

    public CharSequence s() {
        if (Build.VERSION.SDK_INT >= 34) {
            return e.b(this.f4074a);
        }
        return b.c(this.f4074a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void s0(boolean z10) {
        this.f4074a.setContentInvalid(z10);
    }

    public CharSequence t() {
        return this.f4074a.getContentDescription();
    }

    public void t0(boolean z10) {
        this.f4074a.setDismissable(z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        o(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(z());
        sb2.append("; className: ");
        sb2.append(q());
        sb2.append("; text: ");
        sb2.append(C());
        sb2.append("; error: ");
        sb2.append(u());
        sb2.append("; maxTextLength: ");
        sb2.append(w());
        sb2.append("; stateDescription: ");
        sb2.append(B());
        sb2.append("; contentDescription: ");
        sb2.append(t());
        sb2.append("; tooltipText: ");
        sb2.append(D());
        sb2.append("; viewIdResName: ");
        sb2.append(F());
        sb2.append("; uniqueId: ");
        sb2.append(E());
        sb2.append("; checkable: ");
        sb2.append(K());
        sb2.append("; checked: ");
        sb2.append(L());
        sb2.append("; focusable: ");
        sb2.append(P());
        sb2.append("; focused: ");
        sb2.append(Q());
        sb2.append("; selected: ");
        sb2.append(W());
        sb2.append("; clickable: ");
        sb2.append(M());
        sb2.append("; longClickable: ");
        sb2.append(T());
        sb2.append("; contextClickable: ");
        sb2.append(N());
        sb2.append("; enabled: ");
        sb2.append(O());
        sb2.append("; password: ");
        sb2.append(U());
        sb2.append("; scrollable: " + V());
        sb2.append("; containerTitle: ");
        sb2.append(s());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(R());
        sb2.append("; importantForAccessibility: ");
        sb2.append(S());
        sb2.append("; visible: ");
        sb2.append(Z());
        sb2.append("; isTextSelectable: ");
        sb2.append(Y());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(I());
        sb2.append("; [");
        List<a> i10 = i();
        for (int i11 = 0; i11 < i10.size(); i11++) {
            a aVar = i10.get(i11);
            String j10 = j(aVar.b());
            if (j10.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                j10 = aVar.c().toString();
            }
            sb2.append(j10);
            if (i11 != i10.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public CharSequence u() {
        return this.f4074a.getError();
    }

    public void u0(boolean z10) {
        this.f4074a.setEditable(z10);
    }

    public Bundle v() {
        return b.c(this.f4074a);
    }

    public void v0(boolean z10) {
        this.f4074a.setEnabled(z10);
    }

    public int w() {
        return this.f4074a.getMaxTextLength();
    }

    public void w0(CharSequence charSequence) {
        this.f4074a.setError(charSequence);
    }

    public int x() {
        return this.f4074a.getMovementGranularities();
    }

    public void x0(boolean z10) {
        this.f4074a.setFocusable(z10);
    }

    public void y0(boolean z10) {
        this.f4074a.setFocused(z10);
    }

    public CharSequence z() {
        return this.f4074a.getPackageName();
    }

    public void z0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4074a.setHeading(z10);
        } else {
            i0(2, z10);
        }
    }

    private n0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f4074a = accessibilityNodeInfo;
    }

    @Deprecated
    public void e0() {
    }
}
