package da;

import com.google.auto.value.AutoValue;
import java.util.Set;

/* compiled from: ConfigUpdate.java */
@AutoValue
/* loaded from: classes3.dex */
public abstract class b {
    public static b a(Set<String> set) {
        return new a(set);
    }

    public abstract Set<String> b();
}
