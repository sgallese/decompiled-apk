package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import c.a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: d  reason: collision with root package name */
    private static String f3750d;

    /* renamed from: g  reason: collision with root package name */
    private static d f3753g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f3754a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f3755b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f3749c = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static Set<String> f3751e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f3752f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        final String f3756a;

        /* renamed from: b  reason: collision with root package name */
        final int f3757b;

        /* renamed from: c  reason: collision with root package name */
        final String f3758c;

        /* renamed from: d  reason: collision with root package name */
        final Notification f3759d;

        b(String str, int i10, String str2, Notification notification) {
            this.f3756a = str;
            this.f3757b = i10;
            this.f3758c = str2;
            this.f3759d = notification;
        }

        @Override // androidx.core.app.r.e
        public void a(c.a aVar) throws RemoteException {
            aVar.D(this.f3756a, this.f3757b, this.f3758c, this.f3759d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f3756a + ", id:" + this.f3757b + ", tag:" + this.f3758c + "]";
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f3760a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f3761b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f3760a = componentName;
            this.f3761b = iBinder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class d implements Handler.Callback, ServiceConnection {

        /* renamed from: f  reason: collision with root package name */
        private final Context f3762f;

        /* renamed from: m  reason: collision with root package name */
        private final HandlerThread f3763m;

        /* renamed from: p  reason: collision with root package name */
        private final Handler f3764p;

        /* renamed from: q  reason: collision with root package name */
        private final Map<ComponentName, a> f3765q = new HashMap();

        /* renamed from: r  reason: collision with root package name */
        private Set<String> f3766r = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: NotificationManagerCompat.java */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            final ComponentName f3767a;

            /* renamed from: c  reason: collision with root package name */
            c.a f3769c;

            /* renamed from: b  reason: collision with root package name */
            boolean f3768b = false;

            /* renamed from: d  reason: collision with root package name */
            ArrayDeque<e> f3770d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            int f3771e = 0;

            a(ComponentName componentName) {
                this.f3767a = componentName;
            }
        }

        d(Context context) {
            this.f3762f = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f3763m = handlerThread;
            handlerThread.start();
            this.f3764p = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f3768b) {
                return true;
            }
            boolean bindService = this.f3762f.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f3767a), this, 33);
            aVar.f3768b = bindService;
            if (bindService) {
                aVar.f3771e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f3767a);
                this.f3762f.unbindService(this);
            }
            return aVar.f3768b;
        }

        private void b(a aVar) {
            if (aVar.f3768b) {
                this.f3762f.unbindService(this);
                aVar.f3768b = false;
            }
            aVar.f3769c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.f3765q.values()) {
                aVar.f3770d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f3765q.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f3765q.get(componentName);
            if (aVar != null) {
                aVar.f3769c = a.AbstractBinderC0190a.J(iBinder);
                aVar.f3771e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f3765q.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f3767a + ", " + aVar.f3770d.size() + " queued tasks");
            }
            if (aVar.f3770d.isEmpty()) {
                return;
            }
            if (a(aVar) && aVar.f3769c != null) {
                while (true) {
                    e peek = aVar.f3770d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.f3769c);
                        aVar.f3770d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f3767a);
                        }
                    } catch (RemoteException e10) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f3767a, e10);
                    }
                }
                if (!aVar.f3770d.isEmpty()) {
                    i(aVar);
                    return;
                }
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f3764p.hasMessages(3, aVar.f3767a)) {
                return;
            }
            int i10 = aVar.f3771e + 1;
            aVar.f3771e = i10;
            if (i10 > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + aVar.f3770d.size() + " tasks to " + aVar.f3767a + " after " + aVar.f3771e + " retries");
                aVar.f3770d.clear();
                return;
            }
            int i11 = (1 << (i10 - 1)) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
            }
            this.f3764p.sendMessageDelayed(this.f3764p.obtainMessage(3, aVar.f3767a), i11);
        }

        private void j() {
            Set<String> e10 = r.e(this.f3762f);
            if (e10.equals(this.f3766r)) {
                return;
            }
            this.f3766r = e10;
            List<ResolveInfo> queryIntentServices = this.f3762f.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (e10.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f3765q.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f3765q.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f3765q.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(e eVar) {
            this.f3764p.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return false;
                        }
                        d((ComponentName) message.obj);
                        return true;
                    }
                    f((ComponentName) message.obj);
                    return true;
                }
                c cVar = (c) message.obj;
                e(cVar.f3760a, cVar.f3761b);
                return true;
            }
            c((e) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f3764p.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f3764p.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        void a(c.a aVar) throws RemoteException;
    }

    private r(Context context) {
        this.f3754a = context;
        this.f3755b = (NotificationManager) context.getSystemService("notification");
    }

    public static r d(Context context) {
        return new r(context);
    }

    public static Set<String> e(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f3749c) {
            if (string != null) {
                if (!string.equals(f3750d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f3751e = hashSet;
                    f3750d = string;
                }
            }
            set = f3751e;
        }
        return set;
    }

    private void h(e eVar) {
        synchronized (f3752f) {
            if (f3753g == null) {
                f3753g = new d(this.f3754a.getApplicationContext());
            }
            f3753g.h(eVar);
        }
    }

    private static boolean i(Notification notification) {
        Bundle a10 = m.a(notification);
        if (a10 != null && a10.getBoolean("android.support.useSideChannel")) {
            return true;
        }
        return false;
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.f3755b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f3754a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f3754a.getApplicationInfo();
        String packageName = this.f3754a.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i10), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i10) {
        c(null, i10);
    }

    public void c(String str, int i10) {
        this.f3755b.cancel(str, i10);
    }

    public void f(int i10, Notification notification) {
        g(null, i10, notification);
    }

    public void g(String str, int i10, Notification notification) {
        if (i(notification)) {
            h(new b(this.f3754a.getPackageName(), i10, str, notification));
            this.f3755b.cancel(str, i10);
            return;
        }
        this.f3755b.notify(str, i10, notification);
    }
}
