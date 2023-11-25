package h6;

import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: BatchedLogRequest.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class j {
    public static j a(List<m> list) {
        return new d(list);
    }

    public static b9.a b() {
        return new d9.d().j(b.f16487a).k(true).i();
    }

    public abstract List<m> c();
}
