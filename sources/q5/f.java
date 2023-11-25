package q5;

/* compiled from: Identify.kt */
/* loaded from: classes.dex */
public enum f {
    SET("$set"),
    SET_ONCE("$setOnce"),
    ADD("$add"),
    APPEND("$append"),
    CLEAR_ALL("$clearAll"),
    PREPEND("$prepend"),
    UNSET("$unset"),
    PRE_INSERT("$preInsert"),
    POST_INSERT("$postInsert"),
    REMOVE("$remove");

    private final String operationType;

    f(String str) {
        this.operationType = str;
    }

    public final String getOperationType() {
        return this.operationType;
    }
}
