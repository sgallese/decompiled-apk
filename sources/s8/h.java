package s8;

import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import r8.b0;
import r8.c0;

/* compiled from: CrashlyticsReportJsonTransform.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a */
    private static final b9.a f23039a = new d9.d().j(r8.a.f22181a).k(true).i();

    /* compiled from: CrashlyticsReportJsonTransform.java */
    /* loaded from: classes3.dex */
    public interface a<T> {
        T a(JsonReader jsonReader) throws IOException;
    }

    private static b0.d A(JsonReader jsonReader) throws IOException {
        b0.d.a a10 = b0.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("files")) {
                if (!nextName.equals("orgId")) {
                    jsonReader.skipValue();
                } else {
                    a10.c(jsonReader.nextString());
                }
            } else {
                a10.b(l(jsonReader, new a() { // from class: s8.b
                    @Override // s8.h.a
                    public final Object a(JsonReader jsonReader2) {
                        b0.d.b z10;
                        z10 = h.z(jsonReader2);
                        return z10;
                    }
                }));
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static b0.e.AbstractC0518e B(JsonReader jsonReader) throws IOException {
        b0.e.AbstractC0518e.a a10 = b0.e.AbstractC0518e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(jsonReader.nextString());
                    break;
                case 1:
                    a10.c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a10.e(jsonReader.nextString());
                    break;
                case 3:
                    a10.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static b0 C(JsonReader jsonReader) throws IOException {
        b0.b b10 = b0.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    b10.g(A(jsonReader));
                    break;
                case 1:
                    b10.i(jsonReader.nextString());
                    break;
                case 2:
                    b10.b(k(jsonReader));
                    break;
                case 3:
                    b10.c(jsonReader.nextString());
                    break;
                case 4:
                    b10.e(jsonReader.nextString());
                    break;
                case 5:
                    b10.f(jsonReader.nextString());
                    break;
                case 6:
                    b10.h(jsonReader.nextInt());
                    break;
                case 7:
                    b10.d(jsonReader.nextString());
                    break;
                case '\b':
                    b10.j(D(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b10.a();
    }

    private static b0.e D(JsonReader jsonReader) throws IOException {
        b0.e.b a10 = b0.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c10 = '\n';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.l(jsonReader.nextLong());
                    break;
                case 1:
                    a10.j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a10.e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    a10.d(o(jsonReader));
                    break;
                case 4:
                    a10.f(l(jsonReader, new a() { // from class: s8.a
                        @Override // s8.h.a
                        public final Object a(JsonReader jsonReader2) {
                            b0.e.d p10;
                            p10 = h.p(jsonReader2);
                            return p10;
                        }
                    }));
                    break;
                case 5:
                    a10.k(B(jsonReader));
                    break;
                case 6:
                    a10.b(j(jsonReader));
                    break;
                case 7:
                    a10.m(E(jsonReader));
                    break;
                case '\b':
                    a10.g(jsonReader.nextString());
                    break;
                case '\t':
                    a10.c(jsonReader.nextBoolean());
                    break;
                case '\n':
                    a10.h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static b0.e.f E(JsonReader jsonReader) throws IOException {
        b0.e.f.a a10 = b0.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                a10.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static b0.e.a j(JsonReader jsonReader) throws IOException {
        b0.e.a.AbstractC0505a a10 = b0.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.e(jsonReader.nextString());
                    break;
                case 1:
                    a10.b(jsonReader.nextString());
                    break;
                case 2:
                    a10.c(jsonReader.nextString());
                    break;
                case 3:
                    a10.g(jsonReader.nextString());
                    break;
                case 4:
                    a10.f(jsonReader.nextString());
                    break;
                case 5:
                    a10.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static b0.a k(JsonReader jsonReader) throws IOException {
        b0.a.b a10 = b0.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(l(jsonReader, new a() { // from class: s8.d
                        @Override // s8.h.a
                        public final Object a(JsonReader jsonReader2) {
                            b0.a.AbstractC0503a m10;
                            m10 = h.m(jsonReader2);
                            return m10;
                        }
                    }));
                    break;
                case 1:
                    a10.d(jsonReader.nextInt());
                    break;
                case 2:
                    a10.f(jsonReader.nextLong());
                    break;
                case 3:
                    a10.h(jsonReader.nextLong());
                    break;
                case 4:
                    a10.i(jsonReader.nextLong());
                    break;
                case 5:
                    a10.e(jsonReader.nextString());
                    break;
                case 6:
                    a10.g(jsonReader.nextInt());
                    break;
                case 7:
                    a10.j(jsonReader.nextString());
                    break;
                case '\b':
                    a10.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static <T> c0<T> l(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return c0.a(arrayList);
    }

    public static b0.a.AbstractC0503a m(JsonReader jsonReader) throws IOException {
        b0.a.AbstractC0503a.AbstractC0504a a10 = b0.a.AbstractC0503a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals("libraryName")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals("buildId")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.d(jsonReader.nextString());
                    break;
                case 1:
                    a10.b(jsonReader.nextString());
                    break;
                case 2:
                    a10.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static b0.c n(JsonReader jsonReader) throws IOException {
        b0.c.a a10 = b0.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("key")) {
                if (!nextName.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    jsonReader.skipValue();
                } else {
                    a10.c(jsonReader.nextString());
                }
            } else {
                a10.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static b0.e.c o(JsonReader jsonReader) throws IOException {
        b0.e.c.a a10 = b0.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a10.e(jsonReader.nextString());
                    break;
                case 2:
                    a10.h(jsonReader.nextLong());
                    break;
                case 3:
                    a10.b(jsonReader.nextInt());
                    break;
                case 4:
                    a10.d(jsonReader.nextLong());
                    break;
                case 5:
                    a10.c(jsonReader.nextInt());
                    break;
                case 6:
                    a10.f(jsonReader.nextString());
                    break;
                case 7:
                    a10.j(jsonReader.nextInt());
                    break;
                case '\b':
                    a10.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static b0.e.d p(JsonReader jsonReader) throws IOException {
        b0.e.d.b a10 = b0.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(TaskFormActivity.TASK_TYPE_KEY)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.c(s(jsonReader));
                    break;
                case 1:
                    a10.b(q(jsonReader));
                    break;
                case 2:
                    a10.d(w(jsonReader));
                    break;
                case 3:
                    a10.f(jsonReader.nextString());
                    break;
                case 4:
                    a10.e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static b0.e.d.a q(JsonReader jsonReader) throws IOException {
        b0.e.d.a.AbstractC0506a a10 = b0.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    a10.d(t(jsonReader));
                    break;
                case 2:
                    a10.e(l(jsonReader, new a() { // from class: s8.c
                        @Override // s8.h.a
                        public final Object a(JsonReader jsonReader2) {
                            b0.c n10;
                            n10 = h.n(jsonReader2);
                            return n10;
                        }
                    }));
                    break;
                case 3:
                    a10.c(l(jsonReader, new a() { // from class: s8.c
                        @Override // s8.h.a
                        public final Object a(JsonReader jsonReader2) {
                            b0.c n10;
                            n10 = h.n(jsonReader2);
                            return n10;
                        }
                    }));
                    break;
                case 4:
                    a10.f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static b0.e.d.a.b.AbstractC0507a r(JsonReader jsonReader) throws IOException {
        b0.e.d.a.b.AbstractC0507a.AbstractC0508a a10 = b0.e.d.a.b.AbstractC0507a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.c(jsonReader.nextString());
                    break;
                case 1:
                    a10.d(jsonReader.nextLong());
                    break;
                case 2:
                    a10.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a10.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static b0.e.d.c s(JsonReader jsonReader) throws IOException {
        b0.e.d.c.a a10 = b0.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a10.c(jsonReader.nextInt());
                    break;
                case 2:
                    a10.e(jsonReader.nextInt());
                    break;
                case 3:
                    a10.d(jsonReader.nextLong());
                    break;
                case 4:
                    a10.g(jsonReader.nextLong());
                    break;
                case 5:
                    a10.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static b0.e.d.a.b t(JsonReader jsonReader) throws IOException {
        b0.e.d.a.b.AbstractC0509b a10 = b0.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(k(jsonReader));
                    break;
                case 1:
                    a10.f(l(jsonReader, new a() { // from class: s8.e
                        @Override // s8.h.a
                        public final Object a(JsonReader jsonReader2) {
                            b0.e.d.a.b.AbstractC0513e y10;
                            y10 = h.y(jsonReader2);
                            return y10;
                        }
                    }));
                    break;
                case 2:
                    a10.e(x(jsonReader));
                    break;
                case 3:
                    a10.c(l(jsonReader, new a() { // from class: s8.f
                        @Override // s8.h.a
                        public final Object a(JsonReader jsonReader2) {
                            b0.e.d.a.b.AbstractC0507a r10;
                            r10 = h.r(jsonReader2);
                            return r10;
                        }
                    }));
                    break;
                case 4:
                    a10.d(u(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static b0.e.d.a.b.c u(JsonReader jsonReader) throws IOException {
        b0.e.d.a.b.c.AbstractC0510a a10 = b0.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(TaskFormActivity.TASK_TYPE_KEY)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.c(l(jsonReader, new g()));
                    break;
                case 1:
                    a10.e(jsonReader.nextString());
                    break;
                case 2:
                    a10.f(jsonReader.nextString());
                    break;
                case 3:
                    a10.b(u(jsonReader));
                    break;
                case 4:
                    a10.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static b0.e.d.a.b.AbstractC0513e.AbstractC0515b v(JsonReader jsonReader) throws IOException {
        b0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a a10 = b0.e.d.a.b.AbstractC0513e.AbstractC0515b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.d(jsonReader.nextLong());
                    break;
                case 1:
                    a10.f(jsonReader.nextString());
                    break;
                case 2:
                    a10.e(jsonReader.nextLong());
                    break;
                case 3:
                    a10.b(jsonReader.nextString());
                    break;
                case 4:
                    a10.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static b0.e.d.AbstractC0517d w(JsonReader jsonReader) throws IOException {
        b0.e.d.AbstractC0517d.a a10 = b0.e.d.AbstractC0517d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            } else {
                a10.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    private static b0.e.d.a.b.AbstractC0511d x(JsonReader jsonReader) throws IOException {
        b0.e.d.a.b.AbstractC0511d.AbstractC0512a a10 = b0.e.d.a.b.AbstractC0511d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(jsonReader.nextLong());
                    break;
                case 1:
                    a10.c(jsonReader.nextString());
                    break;
                case 2:
                    a10.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static b0.e.d.a.b.AbstractC0513e y(JsonReader jsonReader) throws IOException {
        b0.e.d.a.b.AbstractC0513e.AbstractC0514a a10 = b0.e.d.a.b.AbstractC0513e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a10.b(l(jsonReader, new g()));
                    break;
                case 1:
                    a10.d(jsonReader.nextString());
                    break;
                case 2:
                    a10.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public static b0.d.b z(JsonReader jsonReader) throws IOException {
        b0.d.b.a a10 = b0.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("filename")) {
                if (!nextName.equals("contents")) {
                    jsonReader.skipValue();
                } else {
                    a10.b(Base64.decode(jsonReader.nextString(), 2));
                }
            } else {
                a10.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a10.a();
    }

    public b0 F(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                b0 C = C(jsonReader);
                jsonReader.close();
                return C;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String G(b0 b0Var) {
        return f23039a.b(b0Var);
    }

    public b0.e.d h(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                b0.e.d p10 = p(jsonReader);
                jsonReader.close();
                return p10;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String i(b0.e.d dVar) {
        return f23039a.b(dVar);
    }
}
