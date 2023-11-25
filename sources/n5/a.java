package n5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import qc.h;
import qc.q;

/* compiled from: AndroidContextProvider.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final b f20246d = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f20247a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f20248b;

    /* renamed from: c  reason: collision with root package name */
    private C0457a f20249c;

    /* compiled from: AndroidContextProvider.kt */
    /* renamed from: n5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0457a {

        /* renamed from: a  reason: collision with root package name */
        private String f20250a;

        /* renamed from: b  reason: collision with root package name */
        private final String f20251b;

        /* renamed from: c  reason: collision with root package name */
        private final String f20252c;

        /* renamed from: d  reason: collision with root package name */
        private final String f20253d;

        /* renamed from: e  reason: collision with root package name */
        private final String f20254e;

        /* renamed from: f  reason: collision with root package name */
        private final String f20255f;

        /* renamed from: g  reason: collision with root package name */
        private final String f20256g;

        /* renamed from: h  reason: collision with root package name */
        private final String f20257h;

        /* renamed from: i  reason: collision with root package name */
        private final String f20258i;

        /* renamed from: j  reason: collision with root package name */
        private final String f20259j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f20260k;

        /* renamed from: l  reason: collision with root package name */
        private final boolean f20261l;

        /* renamed from: m  reason: collision with root package name */
        private String f20262m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ a f20263n;

        public C0457a(a aVar) {
            q.i(aVar, "this$0");
            this.f20263n = aVar;
            this.f20260k = true;
            this.f20250a = b();
            this.f20252c = k();
            this.f20253d = "android";
            this.f20254e = j();
            this.f20255f = d();
            this.f20256g = h();
            this.f20257h = i();
            this.f20258i = e();
            this.f20251b = f();
            this.f20259j = g();
            this.f20261l = a();
            this.f20262m = c();
        }

        private final boolean a() {
            try {
                String str = GooglePlayServicesUtil.GMS_ERROR_DIALOG;
                Object invoke = GooglePlayServicesUtil.class.getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, this.f20263n.f20247a);
                if (invoke != null) {
                    if (((Integer) invoke).intValue() != 0) {
                        return false;
                    }
                    return true;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            } catch (ClassNotFoundException unused) {
                n5.b.f20264c.a().d("Google Play Services Util not found!");
                return false;
            } catch (IllegalAccessException unused2) {
                n5.b.f20264c.a().d("Google Play Services not available");
                return false;
            } catch (NoClassDefFoundError unused3) {
                n5.b.f20264c.a().d("Google Play Services Util not found!");
                return false;
            } catch (NoSuchMethodException unused4) {
                n5.b.f20264c.a().d("Google Play Services not available");
                return false;
            } catch (InvocationTargetException unused5) {
                n5.b.f20264c.a().d("Google Play Services not available");
                return false;
            } catch (Exception e10) {
                n5.b.f20264c.a().d(q.q("Error when checking for Google Play Services: ", e10));
                return false;
            }
        }

        private final String b() {
            if (q.d("Amazon", h())) {
                return t();
            }
            return u();
        }

        private final String c() {
            Object invoke;
            try {
                Object invoke2 = AppSet.class.getMethod("getClient", Context.class).invoke(null, this.f20263n.f20247a);
                Object invoke3 = Tasks.class.getMethod("await", Task.class).invoke(null, invoke2.getClass().getMethod("getAppSetIdInfo", new Class[0]).invoke(invoke2, new Object[0]));
                invoke = invoke3.getClass().getMethod("getId", new Class[0]).invoke(invoke3, new Object[0]);
            } catch (ClassNotFoundException unused) {
                n5.b.f20264c.a().d("Google Play Services SDK not found for app set id!");
            } catch (InvocationTargetException unused2) {
                n5.b.f20264c.a().d("Google Play Services not available for app set id");
            } catch (Exception unused3) {
                n5.b.f20264c.a().a("Encountered an error connecting to Google Play Services for app set id");
            }
            if (invoke != null) {
                this.f20262m = (String) invoke;
                return this.f20262m;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        private final String d() {
            String str = Build.BRAND;
            q.h(str, "BRAND");
            return str;
        }

        private final String e() {
            try {
                Object systemService = this.f20263n.f20247a.getSystemService("phone");
                if (systemService != null) {
                    return ((TelephonyManager) systemService).getNetworkOperatorName();
                }
                throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            } catch (Exception unused) {
                return null;
            }
        }

        private final String f() {
            boolean z10;
            String r10 = r();
            boolean z11 = false;
            if (r10 != null && r10.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return r10;
            }
            String s10 = s();
            if (s10 == null || s10.length() == 0) {
                z11 = true;
            }
            if (z11) {
                return q();
            }
            return s10;
        }

        private final String g() {
            String language = x().getLanguage();
            q.h(language, "locale.language");
            return language;
        }

        private final String h() {
            String str = Build.MANUFACTURER;
            q.h(str, "MANUFACTURER");
            return str;
        }

        private final String i() {
            String str = Build.MODEL;
            q.h(str, "MODEL");
            return str;
        }

        private final String j() {
            String str = Build.VERSION.RELEASE;
            q.h(str, "RELEASE");
            return str;
        }

        private final String k() {
            try {
                PackageInfo packageInfo = this.f20263n.f20247a.getPackageManager().getPackageInfo(this.f20263n.f20247a.getPackageName(), 0);
                q.h(packageInfo, "context.packageManager.g…o(context.packageName, 0)");
                return packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException | Exception unused) {
                return null;
            }
        }

        private final String q() {
            String country = x().getCountry();
            q.h(country, "locale.country");
            return country;
        }

        private final String r() {
            Location l10;
            List<Address> fromLocation;
            if (this.f20263n.q() && (l10 = this.f20263n.l()) != null) {
                try {
                    if (Geocoder.isPresent() && (fromLocation = this.f20263n.h().getFromLocation(l10.getLatitude(), l10.getLongitude(), 1)) != null) {
                        for (Address address : fromLocation) {
                            if (address != null) {
                                return address.getCountryCode();
                            }
                        }
                    }
                } catch (IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException | SecurityException unused) {
                }
            }
            return null;
        }

        private final String s() {
            String networkCountryIso;
            try {
                Object systemService = this.f20263n.f20247a.getSystemService("phone");
                if (systemService != null) {
                    TelephonyManager telephonyManager = (TelephonyManager) systemService;
                    if (telephonyManager.getPhoneType() != 2 && (networkCountryIso = telephonyManager.getNetworkCountryIso()) != null) {
                        Locale locale = Locale.US;
                        q.h(locale, "US");
                        String upperCase = networkCountryIso.toUpperCase(locale);
                        q.h(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                        return upperCase;
                    }
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            } catch (Exception unused) {
                return null;
            }
        }

        private final String t() {
            ContentResolver contentResolver = this.f20263n.f20247a.getContentResolver();
            boolean z10 = false;
            if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1) {
                z10 = true;
            }
            this.f20260k = z10;
            String string = Settings.Secure.getString(contentResolver, "advertising_id");
            this.f20250a = string;
            return string;
        }

        private final String u() {
            boolean z10;
            Object invoke;
            Object invoke2;
            try {
                z10 = true;
                invoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, this.f20263n.f20247a);
                invoke2 = invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
            } catch (ClassNotFoundException unused) {
                n5.b.f20264c.a().d("Google Play Services SDK not found for advertising id!");
            } catch (InvocationTargetException unused2) {
                n5.b.f20264c.a().d("Google Play Services not available for advertising id");
            } catch (Exception unused3) {
                n5.b.f20264c.a().a("Encountered an error connecting to Google Play Services for advertising id");
            }
            if (invoke2 != null) {
                if (!((Boolean) invoke2).booleanValue()) {
                    z10 = false;
                }
                this.f20260k = z10;
                Object invoke3 = invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
                if (invoke3 != null) {
                    this.f20250a = (String) invoke3;
                    return this.f20250a;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }

        private final Locale x() {
            LocaleList locales;
            boolean isEmpty;
            Locale locale;
            Configuration configuration = Resources.getSystem().getConfiguration();
            if (Build.VERSION.SDK_INT >= 24) {
                locales = configuration.getLocales();
                q.h(locales, "configuration.locales");
                isEmpty = locales.isEmpty();
                if (!isEmpty) {
                    locale = locales.get(0);
                    q.h(locale, "localeList.get(0)");
                    return locale;
                }
                Locale locale2 = Locale.getDefault();
                q.h(locale2, "getDefault()");
                return locale2;
            }
            Locale locale3 = configuration.locale;
            q.h(locale3, "configuration.locale");
            return locale3;
        }

        public final String A() {
            return this.f20253d;
        }

        public final String B() {
            return this.f20254e;
        }

        public final String C() {
            return this.f20252c;
        }

        public final String l() {
            return this.f20250a;
        }

        public final String m() {
            return this.f20262m;
        }

        public final String n() {
            return this.f20255f;
        }

        public final String o() {
            return this.f20258i;
        }

        public final String p() {
            return this.f20251b;
        }

        public final String v() {
            return this.f20259j;
        }

        public final boolean w() {
            return this.f20260k;
        }

        public final String y() {
            return this.f20256g;
        }

        public final String z() {
            return this.f20257h;
        }
    }

    /* compiled from: AndroidContextProvider.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }

        public final String a() {
            String uuid = UUID.randomUUID().toString();
            q.h(uuid, "randomUUID().toString()");
            return uuid;
        }
    }

    public a(Context context, boolean z10) {
        q.i(context, "context");
        this.f20247a = context;
        this.f20248b = z10;
    }

    private final C0457a e() {
        if (this.f20249c == null) {
            this.f20249c = new C0457a(this);
        }
        return this.f20249c;
    }

    public final String b() {
        C0457a e10 = e();
        q.f(e10);
        return e10.l();
    }

    public final String c() {
        C0457a e10 = e();
        q.f(e10);
        return e10.m();
    }

    public final String d() {
        C0457a e10 = e();
        q.f(e10);
        return e10.n();
    }

    public final String f() {
        C0457a e10 = e();
        q.f(e10);
        return e10.o();
    }

    public final String g() {
        C0457a e10 = e();
        q.f(e10);
        return e10.p();
    }

    protected final Geocoder h() {
        return new Geocoder(this.f20247a, Locale.ENGLISH);
    }

    public final String i() {
        C0457a e10 = e();
        q.f(e10);
        return e10.v();
    }

    public final String j() {
        C0457a e10 = e();
        q.f(e10);
        return e10.y();
    }

    public final String k() {
        C0457a e10 = e();
        q.f(e10);
        return e10.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.location.Location l() {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get most recent location"
            boolean r1 = r8.f20248b
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            android.content.Context r1 = r8.f20247a
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            int r1 = androidx.core.content.a.a(r1, r3)
            if (r1 == 0) goto L1d
            android.content.Context r1 = r8.f20247a
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = androidx.core.content.a.a(r1, r3)
            if (r1 == 0) goto L1d
            return r2
        L1d:
            android.content.Context r1 = r8.f20247a
            java.lang.String r3 = "location"
            java.lang.Object r1 = r1.getSystemService(r3)
            if (r1 == 0) goto L8c
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            r3 = 1
            java.util.List r3 = r1.getProviders(r3)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r3 = r2
        L31:
            if (r3 != 0) goto L34
            return r2
        L34:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L3d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L6b
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            qc.q.f(r5)     // Catch: java.lang.Exception -> L51 java.lang.SecurityException -> L5b
            android.location.Location r5 = r1.getLastKnownLocation(r5)     // Catch: java.lang.Exception -> L51 java.lang.SecurityException -> L5b
            goto L65
        L51:
            n5.b$a r5 = n5.b.f20264c
            n5.b r5 = r5.a()
            r5.d(r0)
            goto L64
        L5b:
            n5.b$a r5 = n5.b.f20264c
            n5.b r5 = r5.a()
            r5.d(r0)
        L64:
            r5 = r2
        L65:
            if (r5 == 0) goto L3d
            r4.add(r5)
            goto L3d
        L6b:
            java.util.Iterator r0 = r4.iterator()
            r3 = -1
        L71:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r0.next()
            android.location.Location r1 = (android.location.Location) r1
            long r5 = r1.getTime()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L71
            long r3 = r1.getTime()
            r2 = r1
            goto L71
        L8b:
            return r2
        L8c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.location.LocationManager"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a.l():android.location.Location");
    }

    public final String m() {
        C0457a e10 = e();
        q.f(e10);
        return e10.A();
    }

    public final String n() {
        C0457a e10 = e();
        q.f(e10);
        return e10.B();
    }

    public final String o() {
        C0457a e10 = e();
        q.f(e10);
        return e10.C();
    }

    public final boolean p() {
        C0457a e10 = e();
        q.f(e10);
        return e10.w();
    }

    public final boolean q() {
        return this.f20248b;
    }
}
