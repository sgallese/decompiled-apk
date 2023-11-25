package g8;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import i8.a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: AbtExperimentInfo.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f16233g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    static final DateFormat f16234h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    private final String f16235a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16236b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16237c;

    /* renamed from: d  reason: collision with root package name */
    private final Date f16238d;

    /* renamed from: e  reason: collision with root package name */
    private final long f16239e;

    /* renamed from: f  reason: collision with root package name */
    private final long f16240f;

    public a(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f16235a = str;
        this.f16236b = str2;
        this.f16237c = str3;
        this.f16238d = date;
        this.f16239e = j10;
        this.f16240f = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(a.c cVar) {
        String str = cVar.f17105d;
        if (str == null) {
            str = "";
        }
        return new a(cVar.f17103b, String.valueOf(cVar.f17104c), str, new Date(cVar.f17114m), cVar.f17106e, cVar.f17111j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b(Map<String, String> map) throws AbtException {
        String str;
        g(map);
        try {
            Date parse = f16234h.parse(map.get("experimentStartTime"));
            long parseLong = Long.parseLong(map.get("triggerTimeoutMillis"));
            long parseLong2 = Long.parseLong(map.get("timeToLiveMillis"));
            String str2 = map.get("experimentId");
            String str3 = map.get("variantId");
            if (map.containsKey("triggerEvent")) {
                str = map.get("triggerEvent");
            } else {
                str = "";
            }
            return new a(str2, str3, str, parse, parseLong, parseLong2);
        } catch (NumberFormatException e10) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    private static void g(Map<String, String> map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : f16233g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f16235a;
    }

    long d() {
        return this.f16238d.getTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.f16236b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a.c f(String str) {
        String str2;
        a.c cVar = new a.c();
        cVar.f17102a = str;
        cVar.f17114m = d();
        cVar.f17103b = this.f16235a;
        cVar.f17104c = this.f16236b;
        if (TextUtils.isEmpty(this.f16237c)) {
            str2 = null;
        } else {
            str2 = this.f16237c;
        }
        cVar.f17105d = str2;
        cVar.f17106e = this.f16239e;
        cVar.f17111j = this.f16240f;
        return cVar;
    }
}
