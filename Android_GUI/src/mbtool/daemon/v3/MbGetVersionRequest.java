// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class MbGetVersionRequest extends Table {
  public static MbGetVersionRequest getRootAsMbGetVersionRequest(ByteBuffer _bb) { return getRootAsMbGetVersionRequest(_bb, new MbGetVersionRequest()); }
  public static MbGetVersionRequest getRootAsMbGetVersionRequest(ByteBuffer _bb, MbGetVersionRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public MbGetVersionRequest __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }


  public static void startMbGetVersionRequest(FlatBufferBuilder builder) { builder.startObject(0); }
  public static int endMbGetVersionRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};
