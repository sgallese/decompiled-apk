package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public class m {

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f3658a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f3659b;

        /* renamed from: c  reason: collision with root package name */
        private final w[] f3660c;

        /* renamed from: d  reason: collision with root package name */
        private final w[] f3661d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f3662e;

        /* renamed from: f  reason: collision with root package name */
        boolean f3663f;

        /* renamed from: g  reason: collision with root package name */
        private final int f3664g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f3665h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f3666i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f3667j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f3668k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f3669l;

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0065a {

            /* renamed from: a  reason: collision with root package name */
            private final IconCompat f3670a;

            /* renamed from: b  reason: collision with root package name */
            private final CharSequence f3671b;

            /* renamed from: c  reason: collision with root package name */
            private final PendingIntent f3672c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f3673d;

            /* renamed from: e  reason: collision with root package name */
            private final Bundle f3674e;

            /* renamed from: f  reason: collision with root package name */
            private ArrayList<w> f3675f;

            /* renamed from: g  reason: collision with root package name */
            private int f3676g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f3677h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f3678i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f3679j;

            public C0065a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void c() {
                if (!this.f3678i || this.f3672c != null) {
                    return;
                }
                throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
            }

            public C0065a a(w wVar) {
                if (this.f3675f == null) {
                    this.f3675f = new ArrayList<>();
                }
                if (wVar != null) {
                    this.f3675f.add(wVar);
                }
                return this;
            }

            public a b() {
                w[] wVarArr;
                c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<w> arrayList3 = this.f3675f;
                if (arrayList3 != null) {
                    Iterator<w> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        w next = it.next();
                        if (next.k()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                w[] wVarArr2 = null;
                if (arrayList.isEmpty()) {
                    wVarArr = null;
                } else {
                    wVarArr = (w[]) arrayList.toArray(new w[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    wVarArr2 = (w[]) arrayList2.toArray(new w[arrayList2.size()]);
                }
                return new a(this.f3670a, this.f3671b, this.f3672c, this.f3674e, wVarArr2, wVarArr, this.f3673d, this.f3676g, this.f3677h, this.f3678i, this.f3679j);
            }

            public C0065a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.i(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private C0065a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f3673d = true;
                this.f3677h = true;
                this.f3670a = iconCompat;
                this.f3671b = e.f(charSequence);
                this.f3672c = pendingIntent;
                this.f3674e = bundle;
                this.f3675f = wVarArr == null ? null : new ArrayList<>(Arrays.asList(wVarArr));
                this.f3673d = z10;
                this.f3676g = i10;
                this.f3677h = z11;
                this.f3678i = z12;
                this.f3679j = z13;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.i(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f3668k;
        }

        public boolean b() {
            return this.f3662e;
        }

        public Bundle c() {
            return this.f3658a;
        }

        public IconCompat d() {
            int i10;
            if (this.f3659b == null && (i10 = this.f3666i) != 0) {
                this.f3659b = IconCompat.i(null, "", i10);
            }
            return this.f3659b;
        }

        public w[] e() {
            return this.f3660c;
        }

        public int f() {
            return this.f3664g;
        }

        public boolean g() {
            return this.f3663f;
        }

        public CharSequence h() {
            return this.f3667j;
        }

        public boolean i() {
            return this.f3669l;
        }

        public boolean j() {
            return this.f3665h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, w[] wVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f3663f = true;
            this.f3659b = iconCompat;
            if (iconCompat != null && iconCompat.m() == 2) {
                this.f3666i = iconCompat.k();
            }
            this.f3667j = e.f(charSequence);
            this.f3668k = pendingIntent;
            this.f3658a = bundle == null ? new Bundle() : bundle;
            this.f3660c = wVarArr;
            this.f3661d = wVarArr2;
            this.f3662e = z10;
            this.f3664g = i10;
            this.f3663f = z11;
            this.f3665h = z12;
            this.f3669l = z13;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class b extends i {

        /* renamed from: e  reason: collision with root package name */
        private IconCompat f3680e;

        /* renamed from: f  reason: collision with root package name */
        private IconCompat f3681f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f3682g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f3683h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f3684i;

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        private static class a {
            static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            static Notification.BigPictureStyle b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.m$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0066b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // androidx.core.app.m.i
        public void b(l lVar) {
            Context context;
            int i10 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle c10 = a.c(a.b(lVar.a()), this.f3735b);
            IconCompat iconCompat = this.f3680e;
            Context context2 = null;
            if (iconCompat != null) {
                if (i10 >= 31) {
                    if (lVar instanceof p) {
                        context = ((p) lVar).f();
                    } else {
                        context = null;
                    }
                    c.a(c10, this.f3680e.t(context));
                } else if (iconCompat.m() == 1) {
                    c10 = a.a(c10, this.f3680e.j());
                }
            }
            if (this.f3682g) {
                IconCompat iconCompat2 = this.f3681f;
                if (iconCompat2 == null) {
                    a.d(c10, null);
                } else if (i10 >= 23) {
                    if (lVar instanceof p) {
                        context2 = ((p) lVar).f();
                    }
                    C0066b.a(c10, this.f3681f.t(context2));
                } else if (iconCompat2.m() == 1) {
                    a.d(c10, this.f3681f.j());
                } else {
                    a.d(c10, null);
                }
            }
            if (this.f3737d) {
                a.e(c10, this.f3736c);
            }
            if (i10 >= 31) {
                c.c(c10, this.f3684i);
                c.b(c10, this.f3683h);
            }
        }

        @Override // androidx.core.app.m.i
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            IconCompat e10;
            if (bitmap == null) {
                e10 = null;
            } else {
                e10 = IconCompat.e(bitmap);
            }
            this.f3681f = e10;
            this.f3682g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            IconCompat e10;
            if (bitmap == null) {
                e10 = null;
            } else {
                e10 = IconCompat.e(bitmap);
            }
            this.f3680e = e10;
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class c extends i {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f3685e;

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        static class a {
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        @Override // androidx.core.app.m.i
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.m.i
        public void b(l lVar) {
            Notification.BigTextStyle a10 = a.a(a.c(a.b(lVar.a()), this.f3735b), this.f3685e);
            if (this.f3737d) {
                a.d(a10, this.f3736c);
            }
        }

        @Override // androidx.core.app.m.i
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f3685e = e.f(charSequence);
            return this;
        }

        public c i(CharSequence charSequence) {
            this.f3735b = e.f(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class g extends i {

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<CharSequence> f3722e = new ArrayList<>();

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        static class a {
            static Notification.InboxStyle a(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.addLine(charSequence);
            }

            static Notification.InboxStyle b(Notification.Builder builder) {
                return new Notification.InboxStyle(builder);
            }

            static Notification.InboxStyle c(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setBigContentTitle(charSequence);
            }

            static Notification.InboxStyle d(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setSummaryText(charSequence);
            }
        }

        @Override // androidx.core.app.m.i
        public void b(l lVar) {
            Notification.InboxStyle c10 = a.c(a.b(lVar.a()), this.f3735b);
            if (this.f3737d) {
                a.d(c10, this.f3736c);
            }
            Iterator<CharSequence> it = this.f3722e.iterator();
            while (it.hasNext()) {
                a.a(c10, it.next());
            }
        }

        @Override // androidx.core.app.m.i
        protected String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public g h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f3722e.add(e.f(charSequence));
            }
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static abstract class i {

        /* renamed from: a  reason: collision with root package name */
        protected e f3734a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f3735b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f3736c;

        /* renamed from: d  reason: collision with root package name */
        boolean f3737d = false;

        public void a(Bundle bundle) {
            if (this.f3737d) {
                bundle.putCharSequence("android.summaryText", this.f3736c);
            }
            CharSequence charSequence = this.f3735b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c10 = c();
            if (c10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
            }
        }

        public abstract void b(l lVar);

        protected abstract String c();

        public RemoteViews d(l lVar) {
            return null;
        }

        public RemoteViews e(l lVar) {
            return null;
        }

        public RemoteViews f(l lVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f3734a != eVar) {
                this.f3734a = eVar;
                if (eVar != null) {
                    eVar.z(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(r2.c.f22076b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(r2.c.f22075a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }
        return bitmap;
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        Notification R;
        boolean S;
        Object T;
        @Deprecated
        public ArrayList<String> U;

        /* renamed from: a  reason: collision with root package name */
        public Context f3686a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f3687b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<u> f3688c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<a> f3689d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f3690e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f3691f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f3692g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f3693h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f3694i;

        /* renamed from: j  reason: collision with root package name */
        IconCompat f3695j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f3696k;

        /* renamed from: l  reason: collision with root package name */
        int f3697l;

        /* renamed from: m  reason: collision with root package name */
        int f3698m;

        /* renamed from: n  reason: collision with root package name */
        boolean f3699n;

        /* renamed from: o  reason: collision with root package name */
        boolean f3700o;

        /* renamed from: p  reason: collision with root package name */
        i f3701p;

        /* renamed from: q  reason: collision with root package name */
        CharSequence f3702q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f3703r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence[] f3704s;

        /* renamed from: t  reason: collision with root package name */
        int f3705t;

        /* renamed from: u  reason: collision with root package name */
        int f3706u;

        /* renamed from: v  reason: collision with root package name */
        boolean f3707v;

        /* renamed from: w  reason: collision with root package name */
        String f3708w;

        /* renamed from: x  reason: collision with root package name */
        boolean f3709x;

        /* renamed from: y  reason: collision with root package name */
        String f3710y;

        /* renamed from: z  reason: collision with root package name */
        boolean f3711z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        public static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setLegacyStreamType(i10);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context, String str) {
            this.f3687b = new ArrayList<>();
            this.f3688c = new ArrayList<>();
            this.f3689d = new ArrayList<>();
            this.f3699n = true;
            this.f3711z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.f3686a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.f3698m = 0;
            this.U = new ArrayList<>();
            this.Q = true;
        }

        protected static CharSequence f(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        private void q(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.R;
                notification.flags = i10 | notification.flags;
                return;
            }
            Notification notification2 = this.R;
            notification2.flags = (~i10) & notification2.flags;
        }

        public e A(CharSequence charSequence) {
            this.R.tickerText = f(charSequence);
            return this;
        }

        public e B(long[] jArr) {
            this.R.vibrate = jArr;
            return this;
        }

        public e C(int i10) {
            this.F = i10;
            return this;
        }

        public e D(long j10) {
            this.R.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f3687b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f3687b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new p(this).c();
        }

        public int d() {
            return this.E;
        }

        public Bundle e() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e g(boolean z10) {
            q(16, z10);
            return this;
        }

        public e h(String str) {
            this.C = str;
            return this;
        }

        public e i(String str) {
            this.K = str;
            return this;
        }

        public e j(int i10) {
            this.E = i10;
            return this;
        }

        public e k(PendingIntent pendingIntent) {
            this.f3692g = pendingIntent;
            return this;
        }

        public e l(CharSequence charSequence) {
            this.f3691f = f(charSequence);
            return this;
        }

        public e m(CharSequence charSequence) {
            this.f3690e = f(charSequence);
            return this;
        }

        public e n(int i10) {
            Notification notification = this.R;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e o(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        public e p(Bundle bundle) {
            this.D = bundle;
            return this;
        }

        public e r(Bitmap bitmap) {
            IconCompat e10;
            if (bitmap == null) {
                e10 = null;
            } else {
                e10 = IconCompat.e(m.b(this.f3686a, bitmap));
            }
            this.f3695j = e10;
            return this;
        }

        public e s(int i10, int i11, int i12) {
            int i13;
            Notification notification = this.R;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            if (i11 != 0 && i12 != 0) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            notification.flags = i13 | (notification.flags & (-2));
            return this;
        }

        public e t(boolean z10) {
            this.f3711z = z10;
            return this;
        }

        public e u(int i10) {
            this.f3697l = i10;
            return this;
        }

        public e v(int i10) {
            this.f3698m = i10;
            return this;
        }

        public e w(boolean z10) {
            this.f3699n = z10;
            return this;
        }

        public e x(int i10) {
            this.R.icon = i10;
            return this;
        }

        public e y(Uri uri) {
            Notification notification = this.R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e10 = a.e(a.c(a.b(), 4), 5);
            this.R.audioAttributes = a.a(e10);
            return this;
        }

        public e z(i iVar) {
            if (this.f3701p != iVar) {
                this.f3701p = iVar;
                if (iVar != null) {
                    iVar.g(this);
                }
            }
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class h extends i {

        /* renamed from: e  reason: collision with root package name */
        private final List<e> f3723e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        private final List<e> f3724f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private u f3725g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f3726h;

        /* renamed from: i  reason: collision with root package name */
        private Boolean f3727i;

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        static class a {
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            static void d(Notification.Style style, Notification.Builder builder) {
                style.setBuilder(builder);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        static class b {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        static class c {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        static class d {
            static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z10) {
                return messagingStyle.setGroupConversation(z10);
            }
        }

        public h(u uVar) {
            if (!TextUtils.isEmpty(uVar.c())) {
                this.f3725g = uVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        private e i() {
            for (int size = this.f3723e.size() - 1; size >= 0; size--) {
                e eVar = this.f3723e.get(size);
                if (eVar.d() != null && !TextUtils.isEmpty(eVar.d().c())) {
                    return eVar;
                }
            }
            if (!this.f3723e.isEmpty()) {
                return this.f3723e.get(r0.size() - 1);
            }
            return null;
        }

        private boolean j() {
            for (int size = this.f3723e.size() - 1; size >= 0; size--) {
                e eVar = this.f3723e.get(size);
                if (eVar.d() != null && eVar.d().c() == null) {
                    return true;
                }
            }
            return false;
        }

        private TextAppearanceSpan l(int i10) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null);
        }

        private CharSequence m(e eVar) {
            CharSequence c10;
            androidx.core.text.a c11 = androidx.core.text.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequence = "";
            if (eVar.d() == null) {
                c10 = "";
            } else {
                c10 = eVar.d().c();
            }
            int i10 = -16777216;
            if (TextUtils.isEmpty(c10)) {
                c10 = this.f3725g.c();
                if (this.f3734a.d() != 0) {
                    i10 = this.f3734a.d();
                }
            }
            CharSequence h10 = c11.h(c10);
            spannableStringBuilder.append(h10);
            spannableStringBuilder.setSpan(l(i10), spannableStringBuilder.length() - h10.length(), spannableStringBuilder.length(), 33);
            if (eVar.e() != null) {
                charSequence = eVar.e();
            }
            spannableStringBuilder.append((CharSequence) "  ").append(c11.h(charSequence));
            return spannableStringBuilder;
        }

        @Override // androidx.core.app.m.i
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f3725g.c());
            bundle.putBundle("android.messagingStyleUser", this.f3725g.i());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f3726h);
            if (this.f3726h != null && this.f3727i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f3726h);
            }
            if (!this.f3723e.isEmpty()) {
                bundle.putParcelableArray("android.messages", e.a(this.f3723e));
            }
            if (!this.f3724f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", e.a(this.f3724f));
            }
            Boolean bool = this.f3727i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.m.i
        public void b(l lVar) {
            boolean z10;
            CharSequence e10;
            CharSequence e11;
            Notification.MessagingStyle b10;
            o(k());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                if (i10 >= 28) {
                    b10 = d.a(this.f3725g.h());
                } else {
                    b10 = b.b(this.f3725g.c());
                }
                Iterator<e> it = this.f3723e.iterator();
                while (it.hasNext()) {
                    b.a(o.a(b10), it.next().g());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    Iterator<e> it2 = this.f3724f.iterator();
                    while (it2.hasNext()) {
                        c.a(o.a(b10), it2.next().g());
                    }
                }
                if (this.f3727i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    b.c(o.a(b10), this.f3726h);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    d.b(o.a(b10), this.f3727i.booleanValue());
                }
                a.d(b10, lVar.a());
                return;
            }
            e i11 = i();
            if (this.f3726h != null && this.f3727i.booleanValue()) {
                lVar.a().setContentTitle(this.f3726h);
            } else if (i11 != null) {
                lVar.a().setContentTitle("");
                if (i11.d() != null) {
                    lVar.a().setContentTitle(i11.d().c());
                }
            }
            if (i11 != null) {
                Notification.Builder a10 = lVar.a();
                if (this.f3726h != null) {
                    e11 = m(i11);
                } else {
                    e11 = i11.e();
                }
                a10.setContentText(e11);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f3726h == null && !j()) {
                z10 = false;
            } else {
                z10 = true;
            }
            for (int size = this.f3723e.size() - 1; size >= 0; size--) {
                e eVar = this.f3723e.get(size);
                if (z10) {
                    e10 = m(eVar);
                } else {
                    e10 = eVar.e();
                }
                if (size != this.f3723e.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, e10);
            }
            a.a(a.c(a.b(lVar.a()), null), spannableStringBuilder);
        }

        @Override // androidx.core.app.m.i
        protected String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public h h(e eVar) {
            if (eVar != null) {
                this.f3723e.add(eVar);
                if (this.f3723e.size() > 25) {
                    this.f3723e.remove(0);
                }
            }
            return this;
        }

        public boolean k() {
            e eVar = this.f3734a;
            if (eVar != null && eVar.f3686a.getApplicationInfo().targetSdkVersion < 28 && this.f3727i == null) {
                if (this.f3726h == null) {
                    return false;
                }
                return true;
            }
            Boolean bool = this.f3727i;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }

        public h n(CharSequence charSequence) {
            this.f3726h = charSequence;
            return this;
        }

        public h o(boolean z10) {
            this.f3727i = Boolean.valueOf(z10);
            return this;
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        public static final class e {

            /* renamed from: a  reason: collision with root package name */
            private final CharSequence f3728a;

            /* renamed from: b  reason: collision with root package name */
            private final long f3729b;

            /* renamed from: c  reason: collision with root package name */
            private final u f3730c;

            /* renamed from: d  reason: collision with root package name */
            private Bundle f3731d = new Bundle();

            /* renamed from: e  reason: collision with root package name */
            private String f3732e;

            /* renamed from: f  reason: collision with root package name */
            private Uri f3733f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: NotificationCompat.java */
            /* loaded from: classes.dex */
            public static class a {
                static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
                }

                static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            public e(CharSequence charSequence, long j10, u uVar) {
                this.f3728a = charSequence;
                this.f3729b = j10;
                this.f3730c = uVar;
            }

            static Bundle[] a(List<e> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = list.get(i10).h();
                }
                return bundleArr;
            }

            private Bundle h() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f3728a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f3729b);
                u uVar = this.f3730c;
                if (uVar != null) {
                    bundle.putCharSequence("sender", uVar.c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(this.f3730c.h()));
                    } else {
                        bundle.putBundle("person", this.f3730c.i());
                    }
                }
                String str = this.f3732e;
                if (str != null) {
                    bundle.putString(TaskFormActivity.TASK_TYPE_KEY, str);
                }
                Uri uri = this.f3733f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f3731d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.f3732e;
            }

            public Uri c() {
                return this.f3733f;
            }

            public u d() {
                return this.f3730c;
            }

            public CharSequence e() {
                return this.f3728a;
            }

            public long f() {
                return this.f3729b;
            }

            Notification.MessagingStyle.Message g() {
                Notification.MessagingStyle.Message a10;
                u d10 = d();
                CharSequence charSequence = null;
                Person person = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    CharSequence e10 = e();
                    long f10 = f();
                    if (d10 != null) {
                        person = d10.h();
                    }
                    a10 = b.b(e10, f10, person);
                } else {
                    CharSequence e11 = e();
                    long f11 = f();
                    if (d10 != null) {
                        charSequence = d10.c();
                    }
                    a10 = a.a(e11, f11, charSequence);
                }
                if (b() != null) {
                    a.b(a10, b(), c());
                }
                return a10;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: NotificationCompat.java */
            /* loaded from: classes.dex */
            public static class b {
                static Notification.MessagingStyle.Message b(CharSequence charSequence, long j10, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, person);
                }

                static Parcelable a(Person person) {
                    return person;
                }
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class f extends i {

        /* renamed from: e  reason: collision with root package name */
        private int f3712e;

        /* renamed from: f  reason: collision with root package name */
        private u f3713f;

        /* renamed from: g  reason: collision with root package name */
        private PendingIntent f3714g;

        /* renamed from: h  reason: collision with root package name */
        private PendingIntent f3715h;

        /* renamed from: i  reason: collision with root package name */
        private PendingIntent f3716i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f3717j;

        /* renamed from: k  reason: collision with root package name */
        private Integer f3718k;

        /* renamed from: l  reason: collision with root package name */
        private Integer f3719l;

        /* renamed from: m  reason: collision with root package name */
        private IconCompat f3720m;

        /* renamed from: n  reason: collision with root package name */
        private CharSequence f3721n;

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        static class a {
            static void a(Notification.CallStyle callStyle, Notification.Builder builder) {
                callStyle.setBuilder(builder);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        static class b {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        static class e {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z10) {
                return builder.setAuthenticationRequired(z10);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        private String i() {
            int i10 = this.f3712e;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return this.f3734a.f3686a.getResources().getString(r2.f.f22112g);
                }
                return this.f3734a.f3686a.getResources().getString(r2.f.f22111f);
            }
            return this.f3734a.f3686a.getResources().getString(r2.f.f22110e);
        }

        private boolean j(a aVar) {
            if (aVar != null && aVar.c().getBoolean("key_action_priority")) {
                return true;
            }
            return false;
        }

        private a k(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(androidx.core.content.a.c(this.f3734a.f3686a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f3734a.f3686a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a b10 = new a.C0065a(IconCompat.h(this.f3734a.f3686a, i10), spannableStringBuilder, pendingIntent).b();
            b10.c().putBoolean("key_action_priority", true);
            return b10;
        }

        private a l() {
            int i10;
            int i11;
            int i12 = r2.d.f22078b;
            int i13 = r2.d.f22077a;
            PendingIntent pendingIntent = this.f3714g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f3717j;
            if (z10) {
                i10 = i12;
            } else {
                i10 = i13;
            }
            if (z10) {
                i11 = r2.f.f22107b;
            } else {
                i11 = r2.f.f22106a;
            }
            return k(i10, i11, this.f3718k, r2.b.f22073a, pendingIntent);
        }

        private a m() {
            int i10 = r2.d.f22079c;
            PendingIntent pendingIntent = this.f3715h;
            if (pendingIntent == null) {
                return k(i10, r2.f.f22109d, this.f3719l, r2.b.f22074b, this.f3716i);
            }
            return k(i10, r2.f.f22108c, this.f3719l, r2.b.f22074b, pendingIntent);
        }

        @Override // androidx.core.app.m.i
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f3712e);
            bundle.putBoolean("android.callIsVideo", this.f3717j);
            u uVar = this.f3713f;
            if (uVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", d.b(uVar.h()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", uVar.i());
                }
            }
            IconCompat iconCompat = this.f3720m;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    bundle.putParcelable("android.verificationIcon", c.a(iconCompat.t(this.f3734a.f3686a)));
                } else {
                    bundle.putParcelable("android.verificationIconCompat", iconCompat.r());
                }
            }
            bundle.putCharSequence("android.verificationText", this.f3721n);
            bundle.putParcelable("android.answerIntent", this.f3714g);
            bundle.putParcelable("android.declineIntent", this.f3715h);
            bundle.putParcelable("android.hangUpIntent", this.f3716i);
            Integer num = this.f3718k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f3719l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // androidx.core.app.m.i
        public void b(l lVar) {
            CharSequence charSequence;
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence2 = null;
            r2 = null;
            Notification.CallStyle a10 = null;
            charSequence2 = null;
            if (i10 >= 31) {
                int i11 = this.f3712e;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (Log.isLoggable("NotifCompat", 3)) {
                                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f3712e));
                            }
                        } else {
                            a10 = e.c(this.f3713f.h(), this.f3716i, this.f3714g);
                        }
                    } else {
                        a10 = e.b(this.f3713f.h(), this.f3716i);
                    }
                } else {
                    a10 = e.a(this.f3713f.h(), this.f3715h, this.f3714g);
                }
                if (a10 != null) {
                    a.a(a10, lVar.a());
                    Integer num = this.f3718k;
                    if (num != null) {
                        e.d(a10, num.intValue());
                    }
                    Integer num2 = this.f3719l;
                    if (num2 != null) {
                        e.f(a10, num2.intValue());
                    }
                    e.i(a10, this.f3721n);
                    IconCompat iconCompat = this.f3720m;
                    if (iconCompat != null) {
                        e.h(a10, iconCompat.t(this.f3734a.f3686a));
                    }
                    e.g(a10, this.f3717j);
                    return;
                }
                return;
            }
            Notification.Builder a11 = lVar.a();
            u uVar = this.f3713f;
            if (uVar != null) {
                charSequence = uVar.c();
            } else {
                charSequence = null;
            }
            a11.setContentTitle(charSequence);
            Bundle bundle = this.f3734a.D;
            if (bundle != null && bundle.containsKey("android.text")) {
                charSequence2 = this.f3734a.D.getCharSequence("android.text");
            }
            if (charSequence2 == null) {
                charSequence2 = i();
            }
            a11.setContentText(charSequence2);
            u uVar2 = this.f3713f;
            if (uVar2 != null) {
                if (i10 >= 23 && uVar2.a() != null) {
                    c.c(a11, this.f3713f.a().t(this.f3734a.f3686a));
                }
                if (i10 >= 28) {
                    d.a(a11, this.f3713f.h());
                } else {
                    b.a(a11, this.f3713f.d());
                }
            }
            b.b(a11, "call");
        }

        @Override // androidx.core.app.m.i
        protected String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<a> h() {
            a m10 = m();
            a l10 = l();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(m10);
            ArrayList<a> arrayList2 = this.f3734a.f3687b;
            int i10 = 2;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.j()) {
                        arrayList.add(aVar);
                    } else if (!j(aVar) && i10 > 1) {
                        arrayList.add(aVar);
                        i10--;
                    }
                    if (l10 != null && i10 == 1) {
                        arrayList.add(l10);
                        i10--;
                    }
                }
            }
            if (l10 != null && i10 >= 1) {
                arrayList.add(l10);
            }
            return arrayList;
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        static class c {
            static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }

            static Parcelable a(Icon icon) {
                return icon;
            }
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        static class d {
            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            static Parcelable b(Person person) {
                return person;
            }
        }
    }
}
