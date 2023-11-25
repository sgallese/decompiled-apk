package a8;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f408a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map f409b;

    static {
        HashMap hashMap = new HashMap();
        f408a = hashMap;
        HashMap hashMap2 = new HashMap();
        f409b = hashMap2;
        hashMap.put(-1, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-2, "INVALID_REQUEST");
    }

    public static String a(int i10) {
        Map map = f408a;
        Integer valueOf = Integer.valueOf(i10);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        String str = (String) map.get(valueOf);
        String str2 = (String) f409b.get(valueOf);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 106 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#");
        sb2.append(str2);
        sb2.append(")");
        return sb2.toString();
    }
}
