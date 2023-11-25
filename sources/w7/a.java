package w7;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import x7.f;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f25433a = new HashSet(Arrays.asList("app_update", "review"));

    /* renamed from: b  reason: collision with root package name */
    private static final Set f25434b = new HashSet(Arrays.asList("native", "unity"));

    /* renamed from: c  reason: collision with root package name */
    private static final Map f25435c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final f f25436d = new f("PlayCoreVersion");

    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        Map b10 = b(str);
        bundle.putInt("playcore_version_code", ((Integer) b10.get("java")).intValue());
        if (b10.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) b10.get("native")).intValue());
        }
        if (b10.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) b10.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map b(String str) {
        Map map;
        synchronized (a.class) {
            Map map2 = f25435c;
            if (!map2.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11003);
                map2.put(str, hashMap);
            }
            map = (Map) map2.get(str);
        }
        return map;
    }
}
