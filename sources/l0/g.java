package l0;

import java.util.Map;

/* compiled from: ImmutableMap.kt */
/* loaded from: classes.dex */
public interface g<K, V> extends Map, rc.a {

    /* compiled from: ImmutableMap.kt */
    /* loaded from: classes.dex */
    public interface a<K, V> extends Map<K, V>, rc.e {
        g<K, V> build();
    }

    a<K, V> builder();
}
