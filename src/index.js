// Library
import React from 'react';
import ReactDOM from 'react-dom';
//import Form from 'react-jsonschema-form';
import Form from "@rjsf/material-ui";

// Internals
const schema = require('./schema.json');
const uiSchema = require('./ui-schema.json');
const formData = require('./form-data.json');

class Example extends React.Component {
    onSubmit = (value, callback) => {
        alert('onSubmit: '+ JSON.stringify(value.formData)); // eslint-disable-line no-console
        //setTimeout(() => callback && callback(), 2000); // just an example in real world can be your XHR call
    }
    onCancel = () => {
        console.log('on reset being called');
    }
    onFormChanged = ({ formData }) => {
        console.log('onFormChanged: ',formData); // eslint-disable-line no-console
    }
    onUpload = (value) => {
        console.log('onUpload: ', value); // eslint-disable-line no-console
    }
    render() {
        return (
             <Form
                  schema={schema}
                  uiSchema={uiSchema}
                  formData={formData}
                  onCancel={this.onCancel}
                  onSubmit={this.onSubmit}
                  onUpload={this.onUpload}
                  onChange={this.onFormChanged}
                  submitOnEnter
                  activityIndicatorEnabled
            />
        );
    }
}

ReactDOM.render(
  <Example />,
  document.getElementById('root')
);

