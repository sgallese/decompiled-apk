package okhttp3.internal.platform.android;

import android.util.Log;
import ec.n0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;
import qc.q;
import yc.w;
import yc.y;

/* compiled from: AndroidLog.kt */
@SuppressSignatureCheck
/* loaded from: classes4.dex */
public final class AndroidLog {
    private static final int MAX_LOG_LENGTH = 4000;
    private static final Map<String, String> knownLoggers;
    public static final AndroidLog INSTANCE = new AndroidLog();
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();

    static {
        String name;
        Map<String, String> r10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = OkHttpClient.class.getPackage();
        if (r22 == null) {
            name = null;
        } else {
            name = r22.getName();
        }
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = OkHttpClient.class.getName();
        q.h(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = Http2.class.getName();
        q.h(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = TaskRunner.class.getName();
        q.h(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        r10 = n0.r(linkedHashMap);
        knownLoggers = r10;
    }

    private AndroidLog() {
    }

    private final void enableLogging(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String str) {
        String Z0;
        String str2 = knownLoggers.get(str);
        if (str2 == null) {
            Z0 = y.Z0(str, 23);
            return Z0;
        }
        return str2;
    }

    public final void androidLog$okhttp(String str, int i10, String str2, Throwable th) {
        int W;
        int min;
        q.i(str, "loggerName");
        q.i(str2, "message");
        String loggerTag = loggerTag(str);
        if (Log.isLoggable(loggerTag, i10)) {
            if (th != null) {
                str2 = str2 + '\n' + ((Object) Log.getStackTraceString(th));
            }
            int length = str2.length();
            int i11 = 0;
            while (i11 < length) {
                W = w.W(str2, '\n', i11, false, 4, null);
                if (W == -1) {
                    W = length;
                }
                while (true) {
                    min = Math.min(W, i11 + 4000);
                    String substring = str2.substring(i11, min);
                    q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, loggerTag, substring);
                    if (min >= W) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }

    public final void enable() {
        for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
            enableLogging(entry.getKey(), entry.getValue());
        }
    }
}
