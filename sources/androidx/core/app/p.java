package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.m;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationCompatBuilder.java */
/* loaded from: classes.dex */
public class p implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3738a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f3739b;

    /* renamed from: c  reason: collision with root package name */
    private final m.e f3740c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f3741d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f3742e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Bundle> f3743f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f3744g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f3745h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f3746i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class a {
        static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setPriority(i10);
        }

        static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        static Notification.Builder d(Notification.Builder builder, boolean z10) {
            return builder.setUsesChronometer(z10);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    static class b {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setShowWhen(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class c {
        static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class d {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    static class e {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class f {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class g {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    static class h {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class i {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class j {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class k {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(m.e eVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Icon t10;
        List list;
        int i10;
        Object obj;
        Bitmap j10;
        this.f3740c = eVar;
        Context context = eVar.f3686a;
        this.f3738a = context;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.f3739b = h.a(context, eVar.K);
        } else {
            this.f3739b = new Notification.Builder(eVar.f3686a);
        }
        Notification notification = eVar.R;
        Notification.Builder lights = this.f3739b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f3694i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z12).setDefaults(notification.defaults).setContentTitle(eVar.f3690e).setContentText(eVar.f3691f).setContentInfo(eVar.f3696k).setContentIntent(eVar.f3692g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = eVar.f3693h;
        if ((notification.flags & 128) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z13).setNumber(eVar.f3697l).setProgress(eVar.f3705t, eVar.f3706u, eVar.f3707v);
        if (i11 < 23) {
            Notification.Builder builder = this.f3739b;
            IconCompat iconCompat = eVar.f3695j;
            if (iconCompat == null) {
                j10 = null;
            } else {
                j10 = iconCompat.j();
            }
            builder.setLargeIcon(j10);
        } else {
            Notification.Builder builder2 = this.f3739b;
            IconCompat iconCompat2 = eVar.f3695j;
            if (iconCompat2 == null) {
                t10 = null;
            } else {
                t10 = iconCompat2.t(context);
            }
            f.b(builder2, t10);
        }
        a.b(a.d(a.c(this.f3739b, eVar.f3702q), eVar.f3700o), eVar.f3698m);
        m.i iVar = eVar.f3701p;
        if (iVar instanceof m.f) {
            Iterator<m.a> it = ((m.f) iVar).h().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        } else {
            Iterator<m.a> it2 = eVar.f3687b.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
        }
        Bundle bundle = eVar.D;
        if (bundle != null) {
            this.f3744g.putAll(bundle);
        }
        int i12 = Build.VERSION.SDK_INT;
        this.f3741d = eVar.H;
        this.f3742e = eVar.I;
        b.a(this.f3739b, eVar.f3699n);
        d.i(this.f3739b, eVar.f3711z);
        d.g(this.f3739b, eVar.f3708w);
        d.j(this.f3739b, eVar.f3710y);
        d.h(this.f3739b, eVar.f3709x);
        this.f3745h = eVar.O;
        e.b(this.f3739b, eVar.C);
        e.c(this.f3739b, eVar.E);
        e.f(this.f3739b, eVar.F);
        e.d(this.f3739b, eVar.G);
        e.e(this.f3739b, notification.sound, notification.audioAttributes);
        if (i12 < 28) {
            list = e(g(eVar.f3688c), eVar.U);
        } else {
            list = eVar.U;
        }
        if (list != null && !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                e.a(this.f3739b, (String) it3.next());
            }
        }
        this.f3746i = eVar.J;
        if (eVar.f3689d.size() > 0) {
            Bundle bundle2 = eVar.e().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i13 = 0; i13 < eVar.f3689d.size(); i13++) {
                bundle4.putBundle(Integer.toString(i13), q.a(eVar.f3689d.get(i13)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.e().putBundle("android.car.EXTENSIONS", bundle2);
            this.f3744g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 23 && (obj = eVar.T) != null) {
            f.c(this.f3739b, obj);
        }
        if (i14 >= 24) {
            c.a(this.f3739b, eVar.D);
            g.e(this.f3739b, eVar.f3704s);
            RemoteViews remoteViews = eVar.H;
            if (remoteViews != null) {
                g.c(this.f3739b, remoteViews);
            }
            RemoteViews remoteViews2 = eVar.I;
            if (remoteViews2 != null) {
                g.b(this.f3739b, remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.J;
            if (remoteViews3 != null) {
                g.d(this.f3739b, remoteViews3);
            }
        }
        if (i14 >= 26) {
            h.b(this.f3739b, eVar.L);
            h.e(this.f3739b, eVar.f3703r);
            h.f(this.f3739b, eVar.M);
            h.g(this.f3739b, eVar.N);
            h.d(this.f3739b, eVar.O);
            if (eVar.B) {
                h.c(this.f3739b, eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.f3739b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator<u> it4 = eVar.f3688c.iterator();
            while (it4.hasNext()) {
                i.a(this.f3739b, it4.next().h());
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            j.a(this.f3739b, eVar.Q);
            j.b(this.f3739b, m.d.a(null));
        }
        if (i15 >= 31 && (i10 = eVar.P) != 0) {
            k.b(this.f3739b, i10);
        }
        if (eVar.S) {
            if (this.f3740c.f3709x) {
                this.f3745h = 2;
            } else {
                this.f3745h = 1;
            }
            this.f3739b.setVibrate(null);
            this.f3739b.setSound(null);
            int i16 = notification.defaults & (-2) & (-3);
            notification.defaults = i16;
            this.f3739b.setDefaults(i16);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(this.f3740c.f3708w)) {
                    d.g(this.f3739b, "silent");
                }
                h.d(this.f3739b, this.f3745h);
            }
        }
    }

    private void b(m.a aVar) {
        int i10;
        Notification.Action.Builder e10;
        Bundle bundle;
        Icon icon;
        int i11 = Build.VERSION.SDK_INT;
        IconCompat d10 = aVar.d();
        if (i11 >= 23) {
            if (d10 != null) {
                icon = d10.s();
            } else {
                icon = null;
            }
            e10 = f.a(icon, aVar.h(), aVar.a());
        } else {
            if (d10 != null) {
                i10 = d10.k();
            } else {
                i10 = 0;
            }
            e10 = d.e(i10, aVar.h(), aVar.a());
        }
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : w.b(aVar.e())) {
                d.c(e10, remoteInput);
            }
        }
        if (aVar.c() != null) {
            bundle = new Bundle(aVar.c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 24) {
            g.a(e10, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i12 >= 28) {
            i.b(e10, aVar.f());
        }
        if (i12 >= 29) {
            j.c(e10, aVar.j());
        }
        if (i12 >= 31) {
            k.a(e10, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        d.b(e10, bundle);
        d.a(this.f3739b, d.d(e10));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<u> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.l
    public Notification.Builder a() {
        return this.f3739b;
    }

    public Notification c() {
        RemoteViews remoteViews;
        Bundle a10;
        RemoteViews f10;
        RemoteViews d10;
        m.i iVar = this.f3740c.f3701p;
        if (iVar != null) {
            iVar.b(this);
        }
        if (iVar != null) {
            remoteViews = iVar.e(this);
        } else {
            remoteViews = null;
        }
        Notification d11 = d();
        if (remoteViews != null) {
            d11.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.f3740c.H;
            if (remoteViews2 != null) {
                d11.contentView = remoteViews2;
            }
        }
        if (iVar != null && (d10 = iVar.d(this)) != null) {
            d11.bigContentView = d10;
        }
        if (iVar != null && (f10 = this.f3740c.f3701p.f(this)) != null) {
            d11.headsUpContentView = f10;
        }
        if (iVar != null && (a10 = m.a(d11)) != null) {
            iVar.a(a10);
        }
        return d11;
    }

    protected Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return a.a(this.f3739b);
        }
        if (i10 >= 24) {
            Notification a10 = a.a(this.f3739b);
            if (this.f3745h != 0) {
                if (d.f(a10) != null && (a10.flags & 512) != 0 && this.f3745h == 2) {
                    h(a10);
                }
                if (d.f(a10) != null && (a10.flags & 512) == 0 && this.f3745h == 1) {
                    h(a10);
                }
            }
            return a10;
        }
        c.a(this.f3739b, this.f3744g);
        Notification a11 = a.a(this.f3739b);
        RemoteViews remoteViews = this.f3741d;
        if (remoteViews != null) {
            a11.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f3742e;
        if (remoteViews2 != null) {
            a11.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f3746i;
        if (remoteViews3 != null) {
            a11.headsUpContentView = remoteViews3;
        }
        if (this.f3745h != 0) {
            if (d.f(a11) != null && (a11.flags & 512) != 0 && this.f3745h == 2) {
                h(a11);
            }
            if (d.f(a11) != null && (a11.flags & 512) == 0 && this.f3745h == 1) {
                h(a11);
            }
        }
        return a11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f3738a;
    }
}
