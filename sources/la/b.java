package la;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DeviceName.java */
/* loaded from: classes4.dex */
public class b {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static Context f19632a;

    /* compiled from: DeviceName.java */
    /* renamed from: la.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0439b {
        void a(c cVar, Exception exc);
    }

    /* compiled from: DeviceName.java */
    /* loaded from: classes4.dex */
    public static final class c {
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public final String f19633a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19634b;

        /* renamed from: c  reason: collision with root package name */
        public final String f19635c;

        /* renamed from: d  reason: collision with root package name */
        public final String f19636d;

        public String a() {
            if (TextUtils.isEmpty(this.f19634b)) {
                return b.b(this.f19636d);
            }
            return this.f19634b;
        }

        public c(String str, String str2, String str3) {
            this(null, str, str2, str3);
        }

        public c(String str, String str2, String str3, String str4) {
            this.f19633a = str;
            this.f19634b = str2;
            this.f19635c = str3;
            this.f19636d = str4;
        }

        private c(JSONObject jSONObject) throws JSONException {
            this.f19633a = jSONObject.getString("manufacturer");
            this.f19634b = jSONObject.getString("market_name");
            this.f19635c = jSONObject.getString("codename");
            this.f19636d = jSONObject.getString("model");
        }
    }

    /* compiled from: DeviceName.java */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        final Context f19637a;

        /* renamed from: b  reason: collision with root package name */
        final Handler f19638b;

        /* renamed from: c  reason: collision with root package name */
        String f19639c;

        /* renamed from: d  reason: collision with root package name */
        String f19640d;

        /* compiled from: DeviceName.java */
        /* loaded from: classes4.dex */
        private final class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            final InterfaceC0439b f19641f;

            /* renamed from: m  reason: collision with root package name */
            c f19642m;

            /* renamed from: p  reason: collision with root package name */
            Exception f19643p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: DeviceName.java */
            /* renamed from: la.b$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public class RunnableC0440a implements Runnable {
                RunnableC0440a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    aVar.f19641f.a(aVar.f19642m, aVar.f19643p);
                }
            }

            a(InterfaceC0439b interfaceC0439b) {
                this.f19641f = interfaceC0439b;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    d dVar = d.this;
                    this.f19642m = b.d(dVar.f19637a, dVar.f19639c, dVar.f19640d);
                } catch (Exception e10) {
                    this.f19643p = e10;
                }
                d.this.f19638b.post(new RunnableC0440a());
            }
        }

        public void a(InterfaceC0439b interfaceC0439b) {
            if (this.f19639c == null && this.f19640d == null) {
                this.f19639c = Build.DEVICE;
                this.f19640d = Build.MODEL;
            }
            a aVar = new a(interfaceC0439b);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                new Thread(aVar).start();
            } else {
                aVar.run();
            }
        }

        private d(Context context) {
            this.f19637a = context;
            this.f19638b = new Handler(context.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (char c10 : charArray) {
            if (z10 && Character.isLetter(c10)) {
                sb2.append(Character.toUpperCase(c10));
                z10 = false;
            } else {
                if (Character.isWhitespace(c10)) {
                    z10 = true;
                }
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    @SuppressLint({"PrivateApi"})
    private static Context c() {
        Context context = f19632a;
        if (context != null) {
            return context;
        }
        try {
            try {
                return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
            } catch (Exception unused) {
                return (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, null);
            }
        } catch (Exception unused2) {
            throw new RuntimeException("DeviceName must be initialized before usage.");
        }
    }

    public static c d(Context context, String str, String str2) {
        la.a aVar;
        c d10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_names", 0);
        String format = String.format("%s:%s", str, str2);
        String string = sharedPreferences.getString(format, null);
        if (string != null) {
            try {
                return new c(new JSONObject(string));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        try {
            aVar = new la.a(context);
            try {
                d10 = aVar.d(str, str2);
            } finally {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (d10 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("manufacturer", d10.f19633a);
            jSONObject.put("codename", d10.f19635c);
            jSONObject.put("model", d10.f19636d);
            jSONObject.put("market_name", d10.f19634b);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(format, jSONObject.toString());
            edit.apply();
            aVar.close();
            return d10;
        }
        aVar.close();
        if (str.equals(Build.DEVICE) && Build.MODEL.equals(str2)) {
            return new c(Build.MANUFACTURER, str, str, str2);
        }
        return new c(null, null, str, str2);
    }

    public static String e() {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        return f(str, str2, b(str2));
    }

    public static String f(String str, String str2, String str3) {
        String str4 = d(c(), str, str2).f19634b;
        if (str4 != null) {
            return str4;
        }
        return str3;
    }

    public static d g(Context context) {
        return new d(context.getApplicationContext());
    }
}
