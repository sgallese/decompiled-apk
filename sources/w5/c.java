package w5;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dc.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import qc.q;
import yc.u;

/* compiled from: PropertiesFile.kt */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private Properties f25406a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25407b;

    /* renamed from: c  reason: collision with root package name */
    private final File f25408c;

    /* renamed from: d  reason: collision with root package name */
    private final m5.a f25409d;

    public c(File file, String str, String str2, m5.a aVar) {
        q.i(file, "directory");
        q.i(str, "key");
        q.i(str2, "prefix");
        this.f25406a = new Properties();
        String str3 = str2 + '-' + str + ".properties";
        this.f25407b = str3;
        this.f25408c = new File(file, str3);
        this.f25409d = aVar;
    }

    private final void h() {
        String b10;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f25408c);
            try {
                d().store(fileOutputStream, (String) null);
                w wVar = w.f13270a;
                nc.b.a(fileOutputStream, null);
            } finally {
            }
        } catch (Exception e10) {
            m5.a aVar = this.f25409d;
            if (aVar != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to save property file with path ");
                sb2.append((Object) this.f25408c.getAbsolutePath());
                sb2.append(", error stacktrace: ");
                b10 = dc.b.b(e10);
                sb2.append(b10);
                aVar.a(sb2.toString());
            }
        }
    }

    @Override // w5.b
    public long a(String str, long j10) {
        Long l10;
        q.i(str, "key");
        String property = this.f25406a.getProperty(str, "");
        q.h(property, "underlyingProperties.getProperty(key, \"\")");
        l10 = u.l(property);
        if (l10 != null) {
            return l10.longValue();
        }
        return j10;
    }

    @Override // w5.b
    public boolean b(String str, long j10) {
        q.i(str, "key");
        this.f25406a.setProperty(str, String.valueOf(j10));
        h();
        return true;
    }

    public final String c(String str, String str2) {
        q.i(str, "key");
        return this.f25406a.getProperty(str, str2);
    }

    public final Properties d() {
        return this.f25406a;
    }

    public final void e() {
        String b10;
        if (this.f25408c.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.f25408c);
                try {
                    d().load(fileInputStream);
                    w wVar = w.f13270a;
                    nc.b.a(fileInputStream, null);
                    return;
                } finally {
                }
            } catch (Exception e10) {
                this.f25408c.delete();
                m5.a aVar = this.f25409d;
                if (aVar != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to load property file with path ");
                    sb2.append((Object) this.f25408c.getAbsolutePath());
                    sb2.append(", error stacktrace: ");
                    b10 = dc.b.b(e10);
                    sb2.append(b10);
                    aVar.a(sb2.toString());
                }
            }
        }
        this.f25408c.getParentFile().mkdirs();
        this.f25408c.createNewFile();
    }

    public final boolean f(String str, String str2) {
        q.i(str, "key");
        q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f25406a.setProperty(str, str2);
        h();
        return true;
    }

    public final boolean g(List<String> list) {
        q.i(list, "keys");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            d().remove((String) it.next());
        }
        h();
        return true;
    }
}
