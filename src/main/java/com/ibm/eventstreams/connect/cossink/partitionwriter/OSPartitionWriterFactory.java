package com.ibm.eventstreams.connect.cossink.partitionwriter;

import com.ibm.cos.Bucket;

public class OSPartitionWriterFactory implements PartitionWriterFactory {

    public OSPartitionWriterFactory() {
    }

    @Override
    public PartitionWriter newPartitionWriter(final int deadlineSec, final int recordsPerObject, final Bucket bucket) {
        return new OSPartitionWriter(deadlineSec, recordsPerObject, bucket);
    }

}
